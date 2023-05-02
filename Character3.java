import java.util.Random;

public class Character3 extends Base {

	 Character3(String name) {
	      this.name = name;
	      this.maxHp = 60;
	      this.hp = 60;
	      this.power = 10;
	   } // 아르마딜로 : 동글동글 귀엽지만 튼튼한 등딱지를 가진 아르마딜로 (방어 캐릭터 / 방어가 가능해서 공격받은 양에서 10만큼의 데미지가 감소됩니다.)
	@Override
	public void underAttack(int attack) {
		Random r = new Random();
		int inputNum = r.nextInt(3) + 1;

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (this.hp - attack < 0) { // 남은 hp에 비해 큰 공격을 받은 경우
			System.out.println(this.name + "가 " + "-" + attack + "만큼 데미지를 받고 죽었다.");
			this.hp = this.hp - attack;
		} else {

			if (inputNum == 1) {

				System.out.println();
				System.out.println("┌─────────┐");
				System.out.println("│　　　　　│");
				System.out.println("└∩───∩────┘");
				System.out.println("(`･ω･´)");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(this.name + "(이)가 방패를 사용하여 공격을 회피했다!");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			} else if (inputNum == 2) {
				System.out.println();
				System.out.println("╭◜◝ ͡ ◜◝ ╮");
				System.out.println("(Ꮚ´꒳`Ꮚ");
				System.out.println("└╰ ͜ ◟◞╯");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(this.name + "(이)가 둥글게 몸을 말아 공격을 회피했다!");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			} else if (inputNum == 3) {
				System.out.println();
				System.out.println(".　∧∧");
				System.out.println(" ( *'ω'*)");
				System.out.println("  (　　)");
				System.out.println("　ｖｖ");
				System.out.println();
				System.out.println("　  川　　폴-짝");
				System.out.println("  ((　))");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(this.name + "(이)가 폴짝 뛰어 공격을 회피했다!");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

			int attackResult = attack - 10; // 방어에 성공하여 10만큼 데미지를 감소한다

			if (attackResult == 0) { // 0인 경우
				System.out.println(this.name + "가 " + "방어에 성공하여 데미지를 받지 않았다!");
			} else {

				System.out.println(this.name + "가 " + "방어에 성공하여 " + "-" + attackResult + "만큼 데미지를 받았다!");
				this.hp = this.hp - attackResult; // 방어 후 데미지만큼 hp 감소
			}

		}

		System.out.println();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

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

		System.out.println(this.name + "가 공격을 시작합니다!");
		System.out.println();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (inputNum == 1) {

			this.power = 10;
			System.out.println();
			System.out.println(this.name + "(이)가 '굴러가며 박치기'를 시전했다!");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println("　　　빙");
			System.out.println("　　　글");
			System.out.println("　　　☝ ╭☞빙그르");
			System.out.println("　　　╰(•́⍛•̀) ╮");
			System.out.println(" 빙그르☜╯  ☟");
			System.out.println("　　　　　　빙");
			System.out.println("　　　　　　글");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.name + "(이)가 '굴러가며 박치기'로 " + this.power + " 데미지로 공격했습니다!");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else if (inputNum == 2) {
			this.power = 20;
			System.out.println();
			System.out.println(this.name + "(이)가 '꼬리 휘두르기'를 시전했다!");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("　　 　 ∧＿∧");
			System.out.println("　　　　(´∀｀)");
			System.out.println("　　 　/　　　ヽ");
			System.out.println("　　   / 人　　＼＼ 彡");
			System.out.println("　     ⊂ノ　)　　 ヽ⊃");
			System.out.println("　　　　  /　人　(");
			System.out.println("　　　    (＿ノ (＿_)");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.name + "(이)가 '꼬리 휘두르기'로 " + this.power + " 데미지로 공격했습니다!");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else if (inputNum == 3) {
			this.power = 30;
			System.out.println();
			System.out.println(this.name + "(이)가 '돌주먹 날리기'를 시전했다!");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println("∧＿∧");
			System.out.println("(　･ω･)＝つ≡つ");
			System.out.println("(っ　≡つ＝つ");
			System.out.println("./　　　) 바바바바");
			System.out.println("( /￣∪");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.name + "(이)가 '돌주먹 날리기'로 " + this.power + " 데미지로 공격했습니다!");
			System.out.println();
		}

		return power;
	}
}
