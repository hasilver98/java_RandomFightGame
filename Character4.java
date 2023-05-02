import java.util.Random;

public class Character4 extends Base {
	Character4(String name) { 
		this.name = name;
		this.maxHp = 65;
	    this.hp = 65;
		this.power = 15;
		
	}// 캣베어 : 고영희얼굴에 망고스틴 발을 가진 캣베어(다양한 매력발산으로 공격과 방어 둘다 가능합니다.)

	@Override
	public void underAttack(int attack) {
		Random r = new Random();
		int inputNum = r.nextInt(3) + 1;
		System.out.println();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int attackResult = attack;    

		if (inputNum == 1) {
			System.out.println();
			System.out.println("ニ|");
			System.out.println("ニ|∧,,∧");
			System.out.println("ニ(・ω・;）");
			System.out.println("ニと　 )");
			System.out.println("ニと_ノ");
			System.out.println("ニ|");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.name + "(이)읏챠읏챠!나무에 올라갔지롱! 안아프지롱!!!OMG>00<꿀단지옴뇸뇸");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(attack > 10) {
				attackResult = attack - 10;
			} else {
				attackResult = 10 - attack;
			}

		} else if (inputNum == 2) {
			System.out.println();
			System.out.println("∧＿∧");
			System.out.println("(´･ω･)");
			System.out.println("(　つ┳⊃)");
			System.out.println("ε(_)へ⌒ヽﾌ");
			System.out.println("(　　(〃･з･)");
			System.out.println("≡≡　◎―◎ ⊃ ⊃");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.name + "(이)붕붕이 타고 슝슝슝!!데헷");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(attack > 20) {
				attackResult = attack - 20;
			} else {
				attackResult = 20 - attack;
			}
			
		} else if (inputNum == 3) {
			System.out.println();
			System.out.println(".　　　∧ ∧");
			System.out.println("　　(˃̶͈̀ ᗨ ˂̶͈́๑)");
			System.out.println("　　　 // ）");
			System.out.println("／￣￣《￣￣＼");
			System.out.println("|　・Ｕ　　　 |");
			System.out.println("| |ι　　　　　  |し");
			System.out.println("Ｕ｜｜￣￣｜｜");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.name + "(이)마이프렌 엘리야 공격을 막아줘!");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
	
			if(attack > 30) {
				attackResult = attack - 30;
			} else {
				attackResult = 30 - attack;
			}
		}
		System.out.println(this.name + "(이)가 " + attack + "만큼 공격을 받았지만, 방어에 성공하여 " + attackResult + "만큼 체력을 얻었다!");
		System.out.println();
		
		// 공격을 받으면 피가 감소한뒤에 방어에 성공해서 체력을 얻어야함
		this.hp = this.hp - attack;

		this.hp = this.hp + attackResult; // 체력 증가
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
			System.out.println();
			System.out.println(this.name + "(이)가 '매력뿜뿜'공격을 시전했다!");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println(".∧＿∧");
			System.out.println("(｡･ω･｡)つ━☆・*。");
			System.out.println("⊂　      / 　　・゜+.");
			System.out.println("しーＪ　　　°。+ *´¨)");
			System.out.println("             .· ´¸.·*´¨) ¸.·*¨)");
			System.out.println("                (¸.·´ (¸.·'* ☆\"");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.name + "(이)가 마법의 가루로 " + this.power + "데미지로 공격했습니다!");
			System.out.println();
		} else if (inputNum == 2) {
			this.power = 20;
			System.out.println();
			System.out.println(this.name + "(이)가 '망고스틴냥냥펀치'공격을 시전했다!");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println(". ∧＿∧");
			System.out.println("(　･ω･)＝つ≡つ");
			System.out.println("(っ　≡つ＝つ");
			System.out.println("/　　 ) ﾊﾞﾊﾞﾊﾞﾊﾞ");
			System.out.println("( /￣∪");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.name + "(이)가 '망고스틴'으로 " + this.power + " 데미지로 공격했습니다!");
			System.out.println();
		} else if (inputNum == 3) {
			this.power = 30;
			System.out.println();
			System.out.println(this.name + "(이)가 '골골송메들리'공격을 시전했다!");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println(".　♪　∧,＿∧");
			System.out.println("　 　(´･ω･`) ))");
			System.out.println("　(( (　つ　ヽ、　♪");
			System.out.println("　　　〉 とノ　)))");
			System.out.println("　　（__ノ^(＿)");
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.name + "(이)가 '골골송메들리'공격으로 " + this.power + " 데미지로 공격했습니다!");
			System.out.println();
		}
		return power;
	}
}
