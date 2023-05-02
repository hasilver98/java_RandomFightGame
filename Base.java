
public class Base {
	int hp;
	int power; // 랜덤으로
	int maxHp;
	String name;	

	Base() {
			
	}
	
	public int attack() {
		return power;
	}

	public void underAttack(int attack) {
		this.hp = this.hp - attack;
		System.out.println(this.name +  attack +"만큼 공격받았습니다!");
	}

	public boolean isLive() {
		if (this.hp < 1) {
			return false;
		}
		return true;
	}
	

	@Override
	public String toString() {
		if (this.isLive()) {
			
			 return      "┏━━━━━━━━━━━━━━━━━━━━━━━━━┓\n"
		                + "   " + this.name + "\n"
		                + "   HP: " + this.hp + " / " + this.maxHp + "\n"
		                + "┗━━━━━━━━━━━━━━━━━━━━━━━━━┛";
		}
		return "┏━━━━━━━━━━━━━━━━━━━━━━━━━┓\n"
        + "   " + this.name + "\n"
        + "   (X_X)\n"
        + "   " + "is dead\n"
        + "┗━━━━━━━━━━━━━━━━━━━━━━━━━┛";
	}
	
	
	
	

}