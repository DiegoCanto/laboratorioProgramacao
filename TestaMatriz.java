package edu.unisinos;

public class TestaMatriz {

		
		public static void main(String[] args) {
			Planilha plan = new Planilha(10,10);
			Formula form = new Formula (0,0,1,1,'+');
			Formula form1 = new Formula (0,0,1,1,'*');
			Formula form2 = new Formula (0,0,1,1,'-');
			Formula form3 = new Formula (0,0,1,1,'/');
			plan.instanciaPlanilha();
			plan.setCell(15.0, 1, 1);
			plan.setCell(15.0, 0, 0);
			
			System.out.print(""+plan.getCell()[0][0].getValue());
			System.out.print("\n"+plan.getCell()[0][0].getLine());
			System.out.print("\n"+plan.getCell()[0][0].getColumn());
			System.out.print("\n---------------------------------------");
			
			
			
			
            plan.setCell("String", 0, 1);
			System.out.print("\n"+plan.getCell()[0][1].getString());
			System.out.print("\n"+plan.getCell()[0][1].getLine());
			System.out.print("\n"+plan.getCell()[0][1].getColumn());
			System.out.print("\n---------------------------------------");
			
			
			
			
            plan.setCell(form, 0, 2);
			System.out.print("\n"+plan.getCell()[0][2].getFormula().getOperation());
			System.out.print("\n"+plan.getCell()[0][2].getLine());
			System.out.print("\n"+plan.getCell()[0][2].getColumn());
			System.out.print("\n---------------------------------------");
			
			
			
            plan.setCell(form1, 0, 3);
			System.out.print("\n"+plan.getCell()[0][3].getFormula().getOperation());
			System.out.print("\n"+plan.getCell()[0][3].getLine());
			System.out.print("\n"+plan.getCell()[0][3].getColumn());
			System.out.print("\n---------------------------------------");
			
			  plan.setCell(form2, 0, 4);
				System.out.print("\n"+plan.getCell()[0][4].getFormula().getOperation());
				System.out.print("\n"+plan.getCell()[0][4].getLine());
				System.out.print("\n"+plan.getCell()[0][4].getColumn());
				System.out.print("\n---------------------------------------");
				
				  plan.setCell(form3, 0, 5);
					System.out.print("\n"+plan.getCell()[0][5].getFormula().getOperation());
					System.out.print("\n"+plan.getCell()[0][5].getLine());
					System.out.print("\n"+plan.getCell()[0][5].getColumn());
					System.out.print("\n---------------------------------------");
			
			
			System.out.print("\n"+plan.getCell()[0][2].getFormula().operatecell(plan));
			System.out.print("\n"+plan.getCell()[0][3].getFormula().operatecell(plan));
			System.out.print("\n"+plan.getCell()[0][4].getFormula().operatecell(plan));
			System.out.print("\n"+plan.getCell()[0][5].getFormula().operatecell(plan));
			
			
			System.out.print("\n---------------------------------------");
			
			plan.mostraPlanilha(0,10,0,10, plan);
			System.out.print("\n---------------------------------------");
			System.out.print("\n---------------------------------------");
			plan.limpaCell(0, 5, 0, 3);
			plan.mostraPlanilha(0,10,0,10, plan);
		}

	}
