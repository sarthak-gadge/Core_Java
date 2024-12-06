package EmployeeeeManagementtttSystemmmm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEmpManDevTes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Employee> empList = new ArrayList<Employee>();
		boolean exit = true;
		Employee emp1 = null;
		do {
			System.out.println("Choice following Options." + "\n1.Enter new employee Detials."
					+ "\n2.Update Record of employee." + "\n3.Delete Employee Detials."
					+ "\n4.Display All Employee Detials." + "\n5.Delete All employee Detials." + "\n6.Exit.");
			int option1 = sc.nextInt();

			if (option1 == 1) {
				System.out.println("Enter Employee ID");
				int cid = sc.nextInt();
				System.out.println("Enter Employee Name");
				String cName = sc.next();
				System.out.println("Enter Employee Basic Salary.");
				double cbasicSal = sc.nextDouble();
				System.out.println("Enter Employee Hra");
				double cHra = sc.nextDouble();
				System.out.println("Enter Employee PF");
				double cPf = sc.nextDouble();
				System.out.println("Choice Designation" + "\n1.Manager." + "\n2.Developer." + "\n3.Tester.");
				int option2 = sc.nextInt();
				if (option2 == 1) {
					System.out.println("Enter Incentive");
					double inc = sc.nextDouble();

					emp1 = new Manager(cid, cName, cbasicSal, cHra, cPf, inc);
				} else if (option2 == 2) {
					System.out.println("Enter Overtime AMount");
					double ot = sc.nextDouble();

					emp1 = new Developer(cid, cName, cbasicSal, cHra, cPf, ot);
				} else if (option2 == 3) {
					System.out.println("Enter Night Allowance AMount");
					double nta = sc.nextDouble();

					emp1 = new Tester(cid, cName, cbasicSal, cHra, cPf, nta);
				}
				empList.add(emp1);
				System.out.println("Employee Info Stored sucessfully!!!");
				System.out.println("===============================================");
				for (Employee emp : empList) {
					System.out.println(emp);
				}
			} else if (option1 == 2) {
				System.out.println("Enter employee ID Which employee you have to update.");
				int id = sc.nextInt();
				for (Employee emp : empList) {
					if (emp.getEmpId() == id) {
						boolean exit1 = true;
						if (emp instanceof Manager) {
							do {
								System.out.println("Choice option what you have to Update." + "\n1.Name"
										+ "\n2.Basic Salary." + "\n3.HRA" + "\n4.INcentive");
								int option2 = sc.nextInt();
								if (option2 == 1) {
									System.out.println("ENter Updated Name.");
									emp.setEmpName(sc.next());
									exit1 = false;
									System.out.println("Name Update Sucessfully!!!");
								} else if (option2 == 2) {
									System.out.println("ENter Updated Basic Salary.");
									emp.setEmpBasicSal(sc.nextDouble());
									exit1 = false;
									System.out.println("Basic Salary Update Sucessfully!!!");
								} else if (option2 == 3) {
									System.out.println("ENter Updated HRA.");
									emp.setEmpHRA(sc.nextDouble());
									exit1 = false;
									System.out.println("HRA Update Sucessfully!!!");
								} else if (option2 == 4) {
									Manager t = (Manager) emp;
									System.out.println("ENter Updated Night Allowance.");
									t.setIncentive(sc.nextDouble());
									exit1 = false;
									System.out.println("Incentive Update Sucessfully!!!");
								} else {
									System.out.println("INvalid OPtion.Choice once again!!!");
								}
							} while (exit1 == true);
							System.out.println("===============================================");
							for (Employee emp6 : empList) {
								System.out.println(emp6);
							}
						} else if (emp instanceof Developer) {
							do {
								System.out.println("Choice option what you have to Update." + "\n1.Name"
										+ "\n2.Basic Salary." + "\n3.HRA" + "\n4.INcentive");
								int option2 = sc.nextInt();
								if (option2 == 1) {
									System.out.println("ENter Updated Name.");
									emp.setEmpName(sc.next());
									exit1 = false;
									System.out.println("Name Update Sucessfully!!!");
								} else if (option2 == 2) {
									System.out.println("ENter Updated Basic Salary.");
									emp.setEmpBasicSal(sc.nextDouble());
									exit1 = false;
									System.out.println("Basic Salary Update Sucessfully!!!");
								} else if (option2 == 3) {
									System.out.println("ENter Updated HRA.");
									emp.setEmpHRA(sc.nextDouble());
									exit1 = false;
									System.out.println("HRA Update Sucessfully!!!");
								} else if (option2 == 4) {
									Developer t = (Developer) emp;
									System.out.println("ENter Updated OverTime.");
									t.setOverTime(sc.nextDouble());
									exit1 = false;
									System.out.println("OverTime Update Sucessfully!!!");
								} else {
									System.out.println("INvalid OPtion.Choice once again!!!");
								}
							} while (exit1 == true);
							System.out.println("===============================================");
							for (Employee emp6 : empList) {
								System.out.println(emp6);
							}
						} else if (emp instanceof Tester) {
							do {
								System.out.println("Choice option what you have to Update." + "\n1.Name"
										+ "\n2.Basic Salary." + "\n3.HRA" + "\n4.OVerTime");
								int option2 = sc.nextInt();
								if (option2 == 1) {
									System.out.println("ENter Updated Name.");
									emp.setEmpName(sc.next());
									exit1 = false;
									System.out.println("Name Update Sucessfully!!!");
								} else if (option2 == 2) {
									System.out.println("ENter Updated Basic Salary.");
									emp.setEmpBasicSal(sc.nextDouble());
									exit1 = false;
									System.out.println("Basic Salary Update Sucessfully!!!");
								} else if (option2 == 3) {
									System.out.println("ENter Updated HRA.");
									emp.setEmpHRA(sc.nextDouble());
									exit1 = false;
									System.out.println("HRA Update Sucessfully!!!");
								} else if (option2 == 4) {
									Tester t = (Tester) emp;
									System.out.println("ENter Updated Night Allowance.");
									t.setNightAllowance(sc.nextDouble());
									exit1 = false;
									System.out.println("NightAllowance Update Sucessfully!!!");
								} else {
									System.out.println("INvalid OPtion.Choice once again!!!");
								}
							} while (exit1 == true);
							System.out.println("===============================================");
							for (Employee emp6 : empList) {
								System.out.println(emp6);
							}
						}
					} else {
						try {
							throw new InvalidEmployeeException();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			} else if (option1 == 3) {
				System.out.println("Enter employee ID Which employee you have to update.");
				int id = sc.nextInt();
				for (Employee emp : empList) {
					if (emp.getEmpId() == id) {
						empList.remove(emp);
					} else {
						try {
							throw new InvalidEmployeeException();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			} else if (option1 == 4) {
				for (Employee emp : empList) {
					System.out.println(emp);
				}
			} else if (option1 == 5) {
				empList.clear();
				System.out.println("All Data was Deleted!!");
			} else if (option1 == 6) {
				exit = false;
			} else {
				System.out.println("Invalid Option!!!");
			}
		} while (exit == true);
	}

}
