package spring;

public class MemberInfoPrinter {
	
	private MemberDao memDao;
	private MemberPrinter printer;
	
	public void printMemberInfo(String email) {
		Member member = memDao.selectByEmail(email);
		if(member == null) {
			System.out.println("데이터가 없습니다.\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}
	
	public void setMemberDao(MemberDao memberDao) {
		this.memDao = memberDao;
	}
	
	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}

}
