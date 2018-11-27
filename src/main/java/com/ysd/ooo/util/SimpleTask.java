package com.ysd.ooo.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ysd.ooo.entity.Consumelogs;
import com.ysd.ooo.entity.Readrooms;
import com.ysd.ooo.entity.Statistics;
import com.ysd.ooo.entity.Students;
import com.ysd.ooo.entity.Techers;
import com.ysd.ooo.service.ConsumelogsService;
import com.ysd.ooo.service.ReadroomsService;
import com.ysd.ooo.service.StatisticsService;
import com.ysd.ooo.service.StudentService;
import com.ysd.ooo.service.TechersService;

@Component
@EnableScheduling
public class SimpleTask {

	/*
	 * 
	 * 任务调度
	 * @Autowired private MyTask myTask;
	 */

	private String id;

	@Resource
	private SimpleDateFormat dateFormat;
	@Autowired
	ConsumelogsService consumservice;

	@Autowired
	StatisticsService statisser;

	@Autowired
	StudentService stuservice;

	@Autowired
	ReadroomsService readroom;

	@Autowired
	TechersService techerservice;

	// 获取当前时间
	Calendar date = Calendar.getInstance();

	// @Scheduled(fixedRate = 1000 * 3) // 每隔三秒
	// public void reportCurrentTime() {
	// myTask.say();// 执行任务方法
	// System.out.println("每隔3秒任务调度一次 现在时间 " + dateFormat.format(new Date()));
	// }

	@Scheduled(cron = "*/5 * * * * ? ")
	public void reportCurrentByCron() {

		/**
		 * 方法一
		 */
		/*
		 * // 编写模拟(每隔5秒)刷卡进入的功能 // 取出所有的学生 取消所有的教师 List<Students> stu =
		 * stuservice.selectstu(); List<Techers> techer = techerservice.selecttech();
		 * 
		 * // 获取list集合的长度 int stunum = stu.size(); int techernum = techer.size(); //
		 * 根据各自集合的长度各自生成一个随机数 int sturandom = (int) (Math.random() * stunum + 1); int
		 * techerrandom = (int) (Math.random() * techernum + 1);
		 * 
		 * System.out.println("学生随机数=>" + sturandom); System.out.println("教师随机数=>" +
		 * techerrandom);
		 * 
		 * // 判断两个随机数的大小(取其一) // 如果学生随机数大于教师的则将学生中的下标为sturandom的学生信息取出来 if (sturandom >
		 * techerrandom) { Students s = stu.get(sturandom - 1); // 将s这个学生存入记录表中
		 * 
		 * // 判断log表中如果没有的话将数据插入其中 if (consumservice.selectfromcardid(s.getCardNO()) ==
		 * null) {
		 * 
		 * // 将阅览室信息取出来 List<Readrooms> read = readroom.selectrandomnum(); int readnum =
		 * read.size(); int readsui = (int) (Math.random() * readnum + 1); Readrooms re
		 * = read.get(readsui - 1); int readid = re.getID();
		 * 
		 * // 将t这个教师存入记录表中 Consumelogs con = new Consumelogs();
		 * con.setCardNO(s.getCardNO()); con.setStatus("0"); con.setInTime(new Date());
		 * con.setReadRoomID(readid);
		 * 
		 * int r = consumservice.insertlog(con); s.setStatus(0); int sr =
		 * stuservice.updatestu(s);
		 * 
		 * String c = ((r > 0 && sr > 0) ? "记录学生成功" : "记录学生失败"); System.out.println(c);
		 * } else if (consumservice.selectfromcardid(s.getCardNO()) != null) { //
		 * 将已经存在的此条记录更改其outtime时间更改成当前时间
		 * 
		 * Consumelogs cc = consumservice.selectfromcardid(s.getCardNO());
		 * cc.setOutTime(new Date()); cc.setStatus("1"); int ccnum =
		 * consumservice.updateconsumlog(cc); s.setStatus(1); int sr =
		 * stuservice.updatestu(s);
		 * 
		 * String c = ((ccnum > 0 && sr > 0) ? "更新学生成功" : "更新学生失败");
		 * System.out.println(c); }
		 * 
		 * } else { // 反之则将教师中下标为techerrandom的学生取出来 Techers t = techer.get(techerrandom
		 * - 1);
		 * 
		 * if (consumservice.selectfromcardid(t.getCardNO()) == null) {
		 * 
		 * // 将阅览室信息取出来 List<Readrooms> read = readroom.selectrandomnum(); int readnum =
		 * read.size(); int readsui = (int) (Math.random() * readnum + 1); Readrooms re
		 * = read.get(readsui - 1); int readid = re.getID();
		 * 
		 * // 将t这个教师存入记录表中 Consumelogs con = new Consumelogs();
		 * con.setCardNO(t.getCardNO()); con.setStatus("0"); con.setInTime(new Date());
		 * con.setReadRoomID(readid);
		 * 
		 * int r = consumservice.insertlog(con);
		 * 
		 * t.setStatus(0); int sr = techerservice.updatethre(t);
		 * 
		 * String c = ((r > 0 && sr > 0) ? "记录教师成功" : "记录教师失败"); System.out.println(c);
		 * } else if (consumservice.selectfromcardid(t.getCardNO()) != null) {
		 * Consumelogs cc = consumservice.selectfromcardid(t.getCardNO());
		 * cc.setOutTime(new Date()); cc.setStatus("1"); int ccnum =
		 * consumservice.updateconsumlog(cc);
		 * 
		 * t.setStatus(1); int sr = techerservice.updatethre(t); String c = ((ccnum > 0
		 * && sr > 0) ? "更新教师成功" : "更新教师失败"); System.out.println(c);
		 * 
		 * }
		 * 
		 * }
		 */

		/**
		 * 方法二 模拟进入阅览室的刷卡记录(5秒一个)
		 */
		List<Readrooms> read = readroom.selectrandomnum();
		int readnum = read.size();
		// 随机一个
		if ((int) (Math.random() * 2 + 1) == 1) {
			// 将学生取出
			Students stu = stuservice.suijiselect();
			if (consumservice.selectfromcardid(stu.getCardNO()) == null) {
				Consumelogs con = new Consumelogs(stu.getCardNO(), readnum, new Date(), null, "0");
				int r = consumservice.insertlog(con);
				stu.setStatus(0);
				int sr = stuservice.updatestu(stu);
				String c = ((r > 0 && sr > 0) ? "记录学生成功" : "记录学生失败");
				System.out.println(c);
			} else {
				Consumelogs cc = consumservice.selectfromcardid(stu.getCardNO());
				cc.setOutTime(new Date());
				cc.setStatus("1");
				int ccnum = consumservice.updateconsumlog(cc);
				stu.setStatus(1);
				int sr = stuservice.updatestu(stu);
				String c = ((ccnum > 0 && sr > 0) ? "更新教师成功" : "更新教师失败");
				System.out.println(c);
			}
		} else if ((int) (Math.random() * 2 + 1) == 2) {
			Techers tech = techerservice.suijiselect();
			if (consumservice.selectfromcardid(tech.getCardNO()) == null) {
				Consumelogs con = new Consumelogs(tech.getCardNO(), readnum, new Date(), null, "0");
				int r = consumservice.insertlog(con);
				tech.setStatus(0);
				int sr = techerservice.updatethre(tech);
				String c = ((r > 0 && sr > 0) ? "记录学生成功" : "记录学生失败");
				System.out.println(c);
			} else {
				Consumelogs cc = consumservice.selectfromcardid(tech.getCardNO());
				cc.setOutTime(new Date());
				cc.setStatus("1");
				int ccnum = consumservice.updateconsumlog(cc);
				tech.setStatus(1);
				int sr = techerservice.updatethre(tech);
				String c = ((ccnum > 0 && sr > 0) ? "更新教师成功" : "更新教师失败");
				System.out.println(c);
			}
		}

	}

	// 任务调度
	@Scheduled(cron = "0 0 23 * * ? ") // 每天23点统计
	public void renwudiaodu() {
		// 每天的23点统计

		/* id=UUIDUtils.getUUID(); */
		
		
		//判断它统计中有没有当天的记录
		
		
		

		List<Readrooms> readnum = readroom.selectrandomnum();

		int read = readnum.size();

		for (int i = 0; i < read; i++) {
			// 查询出下标为id的阅览室的记录个数(当前时间)

			List<Consumelogs> Consumelogs = consumservice.selectConsumelogsnum(readnum.get(i).getID());
			
			
			Statistics sta = new Statistics(readnum.get(i).getID(), Consumelogs.size(), date.get(Calendar.YEAR),
					date.get(Calendar.MARCH) + 1, date.get(Calendar.DATE));
			
			//查询统计表中有没有当天的记录 
			/*Integer cc=statisser.selectpoplenum(0);*/
			
			/*if(cc>0) {
				
				
			}else {
				
				
			}*/
			
			
			int statis = statisser.insertStatistics(sta);

			String c = ((statis > 0) ? "记录统计成功" : "记录统计失败");
			System.out.println(c);

		}

	}
}
