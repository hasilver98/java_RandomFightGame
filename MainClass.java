import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		// 캐릭터 배열 초기화
		Base[] gameChar = new Base[5];

		gameChar[0] = new Character1("피쪽쪽 다크나이트 박쥐");
		gameChar[1] = new Character2("길 가다 뭘 자꾸 줍는 모험가");
		gameChar[2] = new Character3("튼튼한 등딱지 아르마딜로");
		gameChar[3] = new Character4("망고스틴 발을 가진 캣베어");
		gameChar[4] = new Character5("다중인격 쿠키");

		for (int i = 0; i < 9999; i++) {

			System.out.println("=====================================================");
			System.out.println("                                                    ");
			System.out.println("     ##      게임에 오신 것을 환영합니다!  ##            ");
			System.out.println("                                                    ");
			System.out.println("               캐릭터 목록                            ");
			System.out.println("  (1)  피쪽쪽 다크나이트 박쥐   (2) 길 가다 뭘 자꾸 줍는 모험가 ");
			System.out.println(" (3) 튼튼한 등딱지 아르마딜로   (4) 망고스틴 발을 가진 캣베어  (5) 다중인격 쿠키 ");
			System.out.println();
			System.out.println("        대결을 위해 랜덤으로 두 캐릭터를 선택합니다.");
			System.out.println("          승자는 마지막까지 생존한 캐릭터입니다.");
			System.out.println();
			System.out.println("           게임을 시작하려면 엔터를 누르세요.");
			System.out.println();
			System.out.println("=====================================================");
			
			scanner.nextLine();
			
			// 게임 순위를 담을 배열
			int[] gameRank = new int[5];
			
			// 게임순서 추첨
			int[] gameOrder = new int[5];
			
			for (int k = 0; k < 5; k++) {
				gameOrder[k] = random.nextInt(5);
				for (int j = 0; j < k; j++) {
					if (gameOrder[k] == gameOrder[j]) {
						k--;
					}
				}
			}
					
			int num1 = gameOrder[0];
			
			// 총 4회 게임 진행
			for (int game = 0; game < gameOrder.length -1; game++) {
				
				int num2 = gameOrder[game+1];
				
				System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
				System.out.println();
				System.out.println("        " + (game + 1) + " Round");
				System.out.println();
				System.out.println("    " +  gameChar[num1].name + " (" + gameChar[num1].hp + "/" + gameChar[num1].maxHp + ")");
				System.out.println();
				// 일정한 시간 동안 코드 실행을 지연.
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            
	            System.out.println("            VS ");
	            System.out.println();
	           
	            
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            
	            System.out.println( "    " +gameChar[num2].name + " (" + gameChar[num2].hp + "/" + gameChar[num2].maxHp + ")");
				System.out.println();
				System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
				
				try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
				
				System.out.println("=======================");
	            System.out.println(  "    Game  Start!");
	            System.out.println("=======================");
				System.out.println();
				
				// 두 캐릭터가 서로 공격하고 상대방의 공격을 받음
				while (gameChar[num1].isLive() && gameChar[num2].isLive()) {
					gameChar[num2].underAttack(gameChar[num1].attack());
					gameChar[num2].isLive();
					System.out.println(gameChar[num2].toString());
			
					System.out.println("-----------------------------------");
					
				
					if (!gameChar[num1].isLive() || !gameChar[num2].isLive()) {
						break;
					}

					gameChar[num1].underAttack(gameChar[num2].attack());
					gameChar[num1].isLive();
					System.out.println(gameChar[num1].toString());
					System.out.println("-----------------------------------");
					
					System.out.println();
					
					if (!gameChar[num1].isLive() || !gameChar[num2].isLive()) {
						break;
					}
				}

				// 승자 확인
				if (!gameChar[num1].isLive()) {
				    System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
				    System.out.println("   " + gameChar[num2].name + " is win!");
				    System.out.println("   (｡◝‿◜｡)");
				    System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
				    // 진 캐릭터를 등수배열에 넣기
				    gameRank[game] = num1;
				    // 다음 경기를 위한 체력 회복
				    gameChar[num1].hp = gameChar[num1].maxHp;
				    gameChar[num2].hp = gameChar[num2].maxHp;
				
				    // 이긴 캐릭터를 num1 로 세팅
				    num1 = num2;
				} else {
				    System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
				    System.out.println("   " + gameChar[num1].name + " is win!");
				    System.out.println("   (｡◝‿◜｡)");
				    System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
				 // 진 캐릭터를 등수배열에 넣기
				    gameRank[game] = num2;
				 // 다음 경기를 위한 체력 회복
				    gameChar[num1].hp = gameChar[num1].maxHp;
				    gameChar[num2].hp = gameChar[num2].maxHp;
				 // 이긴 캐릭터를 num1 로 세팅
				    num1 = num1;
				  
				}				
				
			} // 게임 종료
			
			// 이긴 캐릭터 등수배열에 넣기
			gameRank[4] = num1;
			
			
			// 최종 순위 출력
			System.out.println("=====================================");
			System.out.println("             최종 순위               ");
			System.out.println("=====================================");
			for (int p = 1; p <= gameRank.length; p++) {
			    System.out.println("   " + p + "등: " + gameChar[gameRank[gameRank.length-p]].name);
			}
			System.out.println("=====================================");
			
			System.out.println();
			System.out.println("다시 경기를 시작하려면 엔터를 누르세요. 종료하려면 'q'를 입력하세요.");
			String input = scanner.nextLine();
			if ("q".equalsIgnoreCase(input)) {
				break;
			}

		}

	}
}
