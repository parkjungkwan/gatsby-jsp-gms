package com.gms.web.constant;

public class SQL {	
	public static final String MEMBER_INSERT=
			String.format(
			"INSERT INTO %s(%s,%s,%s,%s,%s,%s,%s,%s)"
					+"VALUES(?,?,?,?,?,?,?,SYSDATE)",
				DB.TABLE_MEMBER,
				DB.MEMBER_ID,
				DB.NAME,
				DB.PASS,
				DB.SSN,
				DB.PHONE,
				DB.EMAIL,
				DB.PROFILE,
				DB.REGDATE);
	public static final String MEMBER_LIST=String.format("SELECT * FROM %s",DB.TABLE_MEMBER);
	public static final String MEMBER_FINDBYNAME=String.format("SELECT * FROM %s WHERE %s=?",DB.TABLE_MEMBER,DB.NAME);
	public static final String MEMBER_FINDBYID=String.format("SELECT * FROM %s WHERE %s=?", DB.TABLE_MEMBER,DB.MEMBER_ID);
	public static final String MEMBER_COUNT=String.format("SELECT COUNT(*) AS count FROM %s", DB.TABLE_MEMBER);
	public static final String MEMBER_UPDATE=String.format("UPDATE %s SET %s=? 	WHERE %s=?", DB.TABLE_MEMBER,DB.PASS,DB.MEMBER_ID);
	public static final String MEMBER_DELETE=String.format("DELETE FROM %s WHERE %s=?", DB.TABLE_MEMBER,DB.MEMBER_ID);
	public static final String ARTICLE_COUNT=String.format("SELECT COUNT(*) AS count FROM %s", DB.TABLE_BOARD);
	public static final String ARTICLE_LIST=String.format("SELECT * FROM %s",DB.TABLE_BOARD);
	public static final String ARTICLE_FINDBYID=String.format("SELECT * FROM %s WHERE id=?", DB.TABLE_BOARD);
	public static final String ARTICLE_INSERT=String.format("INSERT INTO %s(%s,%s,%s,%s,%s,%s)VALUES(article_seq.nextval,?,?,?,0,SYSDATE)",
			DB.TABLE_BOARD,DB.ARTICLE_SEQ,DB.MEMBER_ID,DB.TITLE,DB.CONTENT,DB.HITCOUNT,DB.REGDATE	);
	public static final String ARTICLE_FINDBYSEQ= String.format("SELECT * FROM %s WHERE %s=?", DB.TABLE_BOARD, DB.ARTICLE_SEQ);
	public static final String BOARD_UPDATE= String.format("UPDATE %s SET %s=?,%s=? WHERE %s=?", DB.TABLE_BOARD,DB.TITLE,DB.CONTENT,DB.ARTICLE_SEQ);
	public static final String BOARD_DELETE= String.format("DELETE FROM %s WHERE %s=?", DB.TABLE_BOARD,DB.ARTICLE_SEQ);
	public static final String MAJOR_INSERT=String.format("INSERT INTO %s(%s,%s,%s,%s) VALUES(?,?,?,?)",DB.TABLE_MAJOR,
				DB.MAJOR_ID,DB.TITLE,DB.MEMBER_ID,DB.SUBJ_ID);
	public static final String STUDENT_LIST=" select t.* "
			+" from (select rownum rnum, s.* " 
					+" from student s)t "
			;
}













