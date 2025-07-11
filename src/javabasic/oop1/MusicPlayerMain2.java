package javabasic.oop1;

public class MusicPlayerMain2 {//절차 지향 방식
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");

        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레리어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
