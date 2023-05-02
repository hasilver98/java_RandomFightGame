import java.util.Random;

public class Character5 extends Base {

	Character5(String name) {
		this.name = name;
		this.maxHp = 70;
		this.hp = 70;
		this.power = 10;
	} // 쿠키 : 다중인격 쿠키 ( 공격 캐릭터 / 먹는 음식에 따라서 다른 쿠키가 되어 공격 필살기가 달라집니다.)

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

		if (inputNum == 1) {

			this.power = 10;
			System.out.println();
			System.out.println(this.name + "(이)가 독버섯을 먹고 독버섯맛 쿠키가 되었다!");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.name + "(이)가 '독버섯을 던져 독구름 발생시키기'를 시전했다!");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println();
			System.out.println("(⊃｡•́‿•̀｡)⊃━✿✿✿✿✿✿");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(this.name + "(이)가 " + this.power + " 데미지로 공격했습니다!");
			System.out.println();

		} else if (inputNum == 2) {

			this.power = 20;
			System.out.println();
			System.out.println(this.name + "(이)가 프로틴을 먹고 근육맛 쿠키가 되었다!");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.name + "(이)가 '항아리처럼 생긴 케틀벨 던지기'를 시전했다!");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println();
			System.out.println("(ノ ˘_˘)ノ　ζ|||ζ　ζ|||ζ　ζ|||ζ");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(this.name + "(이)가 " + this.power + " 데미지로 공격했습니다!");
			System.out.println();

		} else if (inputNum == 3) {

			this.power = 30;
			System.out.println();
			System.out.println(this.name + "(이)가 당근을 먹고 당근맛 쿠키가 되었다!");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.name + "(이)가 '단단한 당근을 연속으로 뽑아 던지기'를 시전했다!");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("(っ’-‘)╮ =͟͟͞͞=͟͟͞͞ṑṑṑ=͟͟͞͞=͟͟͞͞ṑṑṑ=͟͟͞͞=͟͟͞͞ṑṑṑ");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.name + "(이)가 " + this.power + " 데미지로 공격했습니다.");
			System.out.println();

		} else if (inputNum == 4) {

			this.power = 40;
			System.out.println();
			System.out.println(this.name + "(이)가 자색고구마를 먹고 자색 고구마맛 쿠키가 되었다!");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(this.name + "(이)가 '고구마 곤봉을 연타하여 때리기'를 시전했다!");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println("(＃￣□￣)o━∈・・━━━━☆");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println(this.name + "(이)가 " + this.power + " 데미지로 공격했습니다.");
			System.out.println();

		} else if (inputNum == 5) {

			this.power = 50;
			System.out.println();
			System.out.println(this.name + "(이)가 캡사이신을 먹고 캡사이신맛 쿠키가 되었다!");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.name + "(이)가 '캡사이신 마그마 폭발'을 시전했다!");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println("...Λ＿Λ");
			System.out.println("（ㆍωㆍ)つ━☆*。");
			System.out.println("⊂　　 ノ 　　　.뾰");
			System.out.println("　し-Ｊ　　　°。로 *´¨)");
			System.out.println("　　　　　　..　.· ´¸.·롱*´¨) ¸.·*¨)");
			System.out.println("　　　　　　　　　　(¸.·´ (.·¸.'*");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println(this.name + "(이)가 " + this.power + " 데미지로 공격했습니다!");
			System.out.println();

		}
		return power;
	}

	@Override
	public void underAttack(int attack) {
		Random r = new Random();
		int inputNum = r.nextInt(3) + 1;

		if (inputNum == 1) {
			System.out.println();
			System.out.println("   뽀  각  !");
			System.out.println("╰( (ᗒᗩᗕ) )━");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println(this.name + "(이)가 공격을 받아 몸에 금이 갔다!");
			System.out.println();

		} else if (inputNum == 2) {

			System.out.println();
			System.out.println("╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝╮");
			System.out.println("                 충     격                  ");
			System.out.println("╰ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ╯");
			System.out.println("O");
			System.out.println("°");
			System.out.println("/}__/}");
			System.out.println("( • ▼•)");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.name + "(이)가 공격에 큰 충격을 받았다!");
			System.out.println();

		} else if (inputNum == 3) {

			System.out.println();
			System.out.println("✧*｡ヾ(｡>﹏<｡)ﾉﾞ✧*。");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.name + "(이)가 공격에 땀을 흘려 눅눅해졌다!");
			System.out.println();

		}
		System.out.println();
		System.out.println(this.name + "가 " + "-" + attack + " 데미지를 받았습니다!");
		System.out.println();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.hp = this.hp - attack;

	}
}
