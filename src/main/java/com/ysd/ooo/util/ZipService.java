package com.ysd.ooo.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipService {

	private String zipPath = "D:/test.zip";

	public void getZip(String filePats) throws IOException {

		List<File> files = getFiles(filePats);

		ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(zipPath)));
		for (File f : files) {
			InputStream in = new FileInputStream(f);
			String name = getRealName(filePats, f);
			ZipEntry en = new ZipEntry(new File(filePats).getPath() + "/" + name);
			en.setSize(f.length());
			zos.putNextEntry(en);
			zos.setComment("测试");
			int len = 0;
			byte[] buffer = new byte[1024];
			while (-1 != (len = in.read(buffer))) {
				zos.write(buffer, 0, len);
			}
			in.close();
		}
		zos.close();
	}

	private List<File> getFiles(String path) {
		List<File> filesList = new ArrayList<File>();
		File file = new File(path);
		File[] files = file.listFiles();
		for (File f : files) {
			if (f.isFile()) {
				filesList.add(f);
			} else {
				filesList.addAll(getFiles(f.getPath()));
			}

		}
		return filesList;

	}

	private String getRealName(String path, File f) {
		String a = f.getAbsolutePath().replace(path + "\\", "");
		a = a.replace("\\", "/");
		return a;
	}

}
