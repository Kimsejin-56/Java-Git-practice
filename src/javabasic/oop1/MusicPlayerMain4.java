package javabasic.oop1;

public class MusicPlayerMain4 {//절차 지향 방식
    public static void main(String[] args) {
        MusicPlayer data = new MusicPlayer();

        data.on();
        data.volumeUp();
        data.volumeUp();
        data.volumeDown();
        data.showStatus();
        data.off();

    }
}
