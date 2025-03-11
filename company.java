public class Company {
		static String CompanyName;
		String employeename;
		
		
		public void Company(String ComName,String employee){
			this.CompanyName = ComName;
			this.employeename = employee;
			
		}
		public void display() {
			System.out.println(CompanyName);
			System.out.println(employeename);
		}
		
		public static void main(String[] args) {
			Company c = new Company();
			c.Company("Farman pvt Ltd", "Farman");
			c.display();
			
		}

}
