import java.util.Random;

public class Character1 extends Base {

	Character1(String name) { // 피쪽쪽 다크나이트 박쥐
        this.name = name;
        this.maxHp = 65;
        this.hp = 65;
        this.power = 0 ; 
	   }

	   @Override
	   public int attack() {
	      Random r = new Random();
	      int inputNum = r.nextInt(3) + 1;
	      
	      try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	      
	      System.out.println(this.name + "(이)가 공격을 시작합니다!");
	      System.out.println();
	      
	      try {
           Thread.sleep(2000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }


	      if (inputNum == 1) {
	         this.power = 10;
	         System.out.println("/|\\ ^._.^ /|\\");
	         System.out.println();
	         try {
	             Thread.sleep(2000);
	         } catch (InterruptedException e) {
	             e.printStackTrace();
	         }
	         System.out.println(this.name + "(이)가 " + this.power + "으로 공격했습니다!");
	         System.out.println();
	         try {
	             Thread.sleep(2000);
	         } catch (InterruptedException e) {
	             e.printStackTrace();
	         }

	         this.hp += this.power;
	         System.out.println(this.name + "(이)가 " + this.power + "만큼 체력을 회복했습니다!");
	         System.out.println();
	         
	         try {
	             Thread.sleep(2000);
	         } catch (InterruptedException e) {
	             e.printStackTrace();
	         }

	      } else if (inputNum == 2) {
	         this.power = 20;
	         System.out.println("/|\\ ^._.^ /|\\");
	         System.out.println();
	         try {
	             Thread.sleep(2000);
	         } catch (InterruptedException e) {
	             e.printStackTrace();
	         }
	         System.out.println(this.name + "(이)가 " + this.power + "으로 공격했습니다!");
	         System.out.println();
	         try {
	             Thread.sleep(2000);
	         } catch (InterruptedException e) {
	             e.printStackTrace();
	         }

	         this.hp += this.power;
	         System.out.println(this.name + "(이)가 " + this.power + "만큼 체력을 회복했습니다!");
	         System.out.println();
	         try {
	             Thread.sleep(2000);
	         } catch (InterruptedException e) {
	             e.printStackTrace();
	         }

	      } else if (inputNum == 3) {
	         this.power = 30;
	         System.out.println("/|\\ ^._.^ /|\\");
	         System.out.println();
	         try {
	             Thread.sleep(2000);
	         } catch (InterruptedException e) {
	             e.printStackTrace();
	         }
	         System.out.println(this.name + "(이)가 " + this.power + "으로 공격했습니다!");
	         System.out.println();
	         try {
	             Thread.sleep(2000);
	         } catch (InterruptedException e) {
	             e.printStackTrace();
	         }

	         this.hp += this.power;
	         System.out.println(this.name + "(이)가 " + this.power + "만큼 체력을 회복했습니다!");
	         System.out.println();
	        
	      }
	      return power;
	   }
	   
		@Override
		public void underAttack(int attack) {
			
			System.out.println("/|\\ ^ㅠ_ㅠ^ /|\\");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.name + "(이)가 " +"-"+ attack + " 데미지를 받았습니다!");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			this.hp = this.hp - attack;
		}

	}