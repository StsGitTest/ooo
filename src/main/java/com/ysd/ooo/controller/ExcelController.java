package com.ysd.ooo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ysd.ooo.entity.Result;
import com.ysd.ooo.entity.Students;
import com.ysd.ooo.entity.Techers;
import com.ysd.ooo.service.StudentService;
import com.ysd.ooo.service.TechersService;
import com.ysd.ooo.util.PoiUtils;
import com.ysd.ooo.util.ZipService;

@Controller
@RequestMapping("/excel")
public class ExcelController {

	@Autowired
	TechersService techersservice;
	@Autowired
	StudentService studentservice;

	private PoiUtils poiUtils = null;

	/**
	 * localhost:8080/excel/daochutechers
	 * 
	 * 导出所有的老师
	 * 
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "daochutechers", method = RequestMethod.GET)
	public void daochutechers(HttpServletResponse response) throws IOException {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("信息表");

		List<Techers> classmateList = techersservice.selecttech();

		String fileName = "userinf" + ".xls";// 设置要导出的文件的名字
		// 新增数据行，并且设置单元格数据

		int rowNum = 1;

		String[] headers = { "编号", "卡号ID", "姓名", "性别", "科室id", "状态", "备注" };
		// headers表示excel表中第一行的表头

		HSSFRow row = sheet.createRow(0);
		// 在excel表中添加表头

		for (int i = 0; i < headers.length; i++) {
			HSSFCell cell = row.createCell(i);
			HSSFRichTextString text = new HSSFRichTextString(headers[i]);
			cell.setCellValue(text);
		}

		// 在表中存放查询到的数据放入对应的列
		for (Techers teacher : classmateList) {
			HSSFRow row1 = sheet.createRow(rowNum);
			row1.createCell(0).setCellValue(teacher.getID());
			row1.createCell(1).setCellValue(teacher.getCardNO());
			row1.createCell(2).setCellValue(teacher.getName());
			row1.createCell(3).setCellValue(teacher.getSex());
			row1.createCell(4).setCellValue(teacher.getSectionID());
			row1.createCell(5).setCellValue(teacher.getStatus());
			row1.createCell(6).setCellValue(teacher.getRemark());
			rowNum++;
		}

		response.setContentType("application/octet-stream");
		response.setHeader("Content-disposition", "attachment;filename=" + fileName);
		response.flushBuffer();
		workbook.write(response.getOutputStream());
	}

	/**
	 * localhost:8080/excel/daochustudents
	 * 
	 * 导出所有的学生
	 * 
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "daochustudents", method = RequestMethod.GET)
	public void daochustudents(HttpServletResponse response) throws IOException {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("信息表");

		List<Students> classmateList = studentservice.selectstu();
		System.out.println(classmateList);

		String fileName = "userinf" + ".xls";// 设置要导出的文件的名字
		// 新增数据行，并且设置单元格数据

		int rowNum = 1;

		String[] headers = { "编号", "卡号ID", "姓名", "性别", "院系id", "状态", "备注", "学号" };
		// headers表示excel表中第一行的表头

		HSSFRow row = sheet.createRow(0);
		// 在excel表中添加表头

		for (int i = 0; i < headers.length; i++) {
			HSSFCell cell = row.createCell(i);
			HSSFRichTextString text = new HSSFRichTextString(headers[i]);
			cell.setCellValue(text);
		}

		// 在表中存放查询到的数据放入对应的列
		for (Students students : classmateList) {
			HSSFRow row1 = sheet.createRow(rowNum);
			row1.createCell(0).setCellValue(students.getID());
			row1.createCell(1).setCellValue(students.getCardNO());
			row1.createCell(2).setCellValue(students.getName());
			row1.createCell(3).setCellValue(students.getSex());
			row1.createCell(4).setCellValue(students.getMembershipID());
			row1.createCell(5).setCellValue(students.getStatus());
			row1.createCell(6).setCellValue(students.getRemark());
			row1.createCell(7).setCellValue(students.getStuNO());
			rowNum++;
		}

		response.setContentType("application/octet-stream");
		response.setHeader("Content-disposition", "attachment;filename=" + fileName);
		response.flushBuffer();
		workbook.write(response.getOutputStream());
		
		/*ZipService zipService = new ZipService();
		
		try {
			zipService.getZip(workbook);
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		
		
		
	}

	/**
	 * localhost:8080/excel/daochustudents
	 * 
	 * 导出所有的学生
	 * 
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "daochustudentsduo", method = RequestMethod.GET)
	public void daochustudentsduo(HttpServletResponse response, String id) throws IOException {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("信息表");

		List<Students> classmateList = studentservice.selectstuduo(id);
		System.out.println(classmateList);

		String fileName = "userinf" + ".xls";// 设置要导出的文件的名字
		// 新增数据行，并且设置单元格数据

		int rowNum = 1;

		String[] headers = { "编号", "卡号ID", "姓名", "性别", "院系id", "状态", "备注", "学号" };
		// headers表示excel表中第一行的表头

		HSSFRow row = sheet.createRow(0);
		// 在excel表中添加表头

		for (int i = 0; i < headers.length; i++) {
			HSSFCell cell = row.createCell(i);
			HSSFRichTextString text = new HSSFRichTextString(headers[i]);
			cell.setCellValue(text);
		}

		// 在表中存放查询到的数据放入对应的列
		for (Students students : classmateList) {
			HSSFRow row1 = sheet.createRow(rowNum);
			row1.createCell(0).setCellValue(students.getID());
			row1.createCell(1).setCellValue(students.getCardNO());
			row1.createCell(2).setCellValue(students.getName());
			row1.createCell(3).setCellValue(students.getSex());
			row1.createCell(4).setCellValue(students.getMembershipID());
			row1.createCell(5).setCellValue(students.getStatus());
			row1.createCell(6).setCellValue(students.getRemark());
			row1.createCell(7).setCellValue(students.getStuNO());
			rowNum++;
		}

		response.setContentType("application/octet-stream");
		response.setHeader("Content-disposition", "attachment;filename=" + fileName);
		response.flushBuffer();
		workbook.write(response.getOutputStream());
	}

	/**
	 * localhost:8080/excel/daochustudents
	 * 
	 * 导出所有的学生
	 * 
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "daochustudentsmoban", method = RequestMethod.GET)
	public void daochustudentsmoban(HttpServletResponse response) throws IOException {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("信息表");

		List<Students> classmateListcc = studentservice.selectstu();
		Students classmateList = classmateListcc.get(0);

		System.out.println(classmateList);

		String fileName = "userinf" + ".xls";// 设置要导出的文件的名字
		// 新增数据行，并且设置单元格数据

		int rowNum = 1;

		String[] headers = { "编号", "卡号ID", "姓名", "性别", "院系id", "状态", "备注", "学号" };
		// headers表示excel表中第一行的表头

		HSSFRow row = sheet.createRow(0);
		// 在excel表中添加表头

		for (int i = 0; i < headers.length; i++) {
			HSSFCell cell = row.createCell(i);
			HSSFRichTextString text = new HSSFRichTextString(headers[i]);
			cell.setCellValue(text);
		}

		// 在表中存放查询到的数据放入对应的列

		HSSFRow row1 = sheet.createRow(rowNum);
		row1.createCell(0).setCellValue(classmateList.getID());
		row1.createCell(1).setCellValue(classmateList.getCardNO());
		row1.createCell(2).setCellValue(classmateList.getName());
		row1.createCell(3).setCellValue(classmateList.getSex());
		row1.createCell(4).setCellValue(classmateList.getMembershipID());
		row1.createCell(5).setCellValue(classmateList.getStatus());
		row1.createCell(6).setCellValue(classmateList.getRemark());
		row1.createCell(7).setCellValue(classmateList.getStuNO());

		response.setContentType("application/octet-stream");
		response.setHeader("Content-disposition", "attachment;filename=" + fileName);
		response.flushBuffer();
		workbook.write(response.getOutputStream());
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/uploadrolestudent", name = "导入用户")
	@ResponseBody
	public Result uploadroleuser(MultipartFile myfile) throws IOException {

		System.out.println(myfile.getName());

		String originalFilename = myfile.getOriginalFilename();
		System.out.println("poiUtils==>" + poiUtils);
		System.out.println("getInputStream==>" + myfile.getInputStream());
		System.out.println("originalFilename==>" + originalFilename);
		poiUtils = new PoiUtils();
		List<Students> list = (List<Students>) poiUtils.parseExcel(Students.class, myfile.getInputStream(),
				originalFilename);

		System.out.println("=>" + list);
		int r = 0;
		for (int i = 0; i < list.size(); i++) {
			Students stu = list.get(i);
			r = studentservice.addstu(stu);

		}
		System.out.println("==>" + r);
		if (r > 0) {
			return new Result(true, "导入成功", "导入成功");
		} else {
			return new Result(false, "导入失败", "导入失败");
		}
	}

	/*@SuppressWarnings("yasuo")
	@RequestMapping(value = "/uploadrolestudent", name = "导入用户")
	@ResponseBody
	public void contextLoads(HttpServletResponse response) {
		ZipService zipService = new ZipService();
		try {
			
			zipService.getZip(filePats);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}*/
	
	

	
	
}
