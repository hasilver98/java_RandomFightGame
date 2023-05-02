import java.util.Random;

public class Character2 extends Base {

	Character2(String name) { 
		this.name = name;
		this.maxHp = 75;
		this.hp = 75;
		this.power = 10;
	   } // 길 가다 뭘 자꾸 줍는 모험가 ( 공격 캐릭터 / 발견하는 아이템에 따라 공격력과 hp에 변화가 생깁니다.) 
	@Override
	public int attack() {
		Random r = new Random();
		int inputNum = r.nextInt(5) + 1;
		
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
        

		// 공격 전, 아이템 탐색
		if (inputNum == 1) {
			this.power += 5;
			System.out.println("앗! " + this.name + "(이)가 무언가를 발견했다!");
			System.out.println();
			 try {
	              Thread.sleep(2000);
	          } catch (InterruptedException e) {
	              e.printStackTrace();
	          }
			System.out.println("");
			System.out.println(". ∧,,∧");
			System.out.println("∩(＾ 0 ＾)∩");
			System.out.println("ヽ　　　ノ");
			System.out.println("　|　　|");
			System.out.println("　 U⌒U.");
			System.out.println("");
			 try {
	              Thread.sleep(2000);
	          } catch (InterruptedException e) {
	              e.printStackTrace();
	          }
			System.out.println(this.name + "(이)가 몽둥이를 획득하여 공격력이 " + this.power + "로 상승하였습니다!!");
			System.out.println();
			 try {
	              Thread.sleep(2000);
	          } catch (InterruptedException e) {
	              e.printStackTrace();
	          }
		} else if (inputNum == 2) {
			this.hp += 10;
			System.out.println("앗! " + this.name + "(이)가 무언가를 발견했다!");
			System.out.println();
			 try {
	              Thread.sleep(2000);
	          } catch (InterruptedException e) {
	              e.printStackTrace();
	          }
			System.out.println("");
			System.out.println(". ∧,,∧");
			System.out.println("∩(＾ 0 ＾)∩");
			System.out.println("ヽ　　　ノ");
			System.out.println("　|　　|");
			System.out.println("　 U⌒U.");
			System.out.println("");
			System.out.println();
			 try {
	              Thread.sleep(2000);
	          } catch (InterruptedException e) {
	              e.printStackTrace();
	          }
			System.out.println(this.name + "(이)가 오메가3를 획득하여 체력이 " + this.hp + "으로 상승하였습니다!");
			 try {
	              Thread.sleep(2000);
	          } catch (InterruptedException e) {
	              e.printStackTrace();
	          }
		} else if (inputNum == 3) {
			System.out.println("＿人人人人人人人＿");
			System.out.println("＞　　   꽝!   　＜");
			System.out.println("￣^Y^Y^Y^Y^Y^Y^Y￣");
			System.out.println();
			 try {
	              Thread.sleep(2000);
	          } catch (InterruptedException e) {
	              e.printStackTrace();
	          }
			System.out.println(this.name + "(이)가 아무 것도 발견하지 못했습니다. 꽝!");
			System.out.println();
			 try {
	              Thread.sleep(2000);
	          } catch (InterruptedException e) {
	              e.printStackTrace();
	          }

		} else if (inputNum == 4) {
			System.out.println("＿人人人人人人人＿");
			System.out.println("＞　　   꽝!!   　＜");
			System.out.println("￣^Y^Y^Y^Y^Y^Y^Y￣");
			System.out.println();
			 try {
	              Thread.sleep(2000);
	          } catch (InterruptedException e) {
	              e.printStackTrace();
	          }
			System.out.println(this.name + "(이)가 아무 것도 발견하지 못했습니다. 꽝!");
			System.out.println();
			 try {
	              Thread.sleep(2000);
	          } catch (InterruptedException e) {
	              e.printStackTrace();
	          }
		} else if (inputNum == 5) {
			System.out.println("＿人人人人人人人＿");
			System.out.println("＞　　   꽝!!   　＜");
			System.out.println("￣^Y^Y^Y^Y^Y^Y^Y￣");
			System.out.println();
			 try {
	              Thread.sleep(2000);
	          } catch (InterruptedException e) {
	              e.printStackTrace();
	          }
			System.out.println(this.name + "(이)가 아무 것도 발견하지 못했습니다. 꽝!");
			System.out.println();
			 try {
	              Thread.sleep(2000);
	          } catch (InterruptedException e) {
	              e.printStackTrace();
	          }
		}
		// 공격
		System.out.println(this.name + "(이)가 " + this.power + "으로 공격했습니다!"); 
		System.out.println();
		
		return power;
	}

	@Override
	public void underAttack(int attack) {

		System.out.println("(｀△´) ");
		System.out.println();
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

