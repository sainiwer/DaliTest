package wenyu3;

import java.util.Date;
import java.util.Random;

/*
 * 类和对象的第一个例子。
 */
public class TestTv {

	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);

		TV tv2 = new TV(12, 6);
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();

		System.out.println("tv1's channel is  " + tv1.channel + "  and volume level is " + tv1.volumeLevel);
		System.out.println("tv2's channel is  " + tv2.channel + "  and volume level is " + tv2.volumeLevel);
		
		Date date = new  Date();
		
		System.out.println(date.getTime());
		System.out.println(date.toString());
		
		Random random1 = new Random(3);
		
		for(int i=0;i<10;i++){
			System.out.println(random1.nextInt(1000));
		}
		
	}
}

class TV {
	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;

	public TV() {

	}

	public TV(int channel, int volumeLevel) {
		this.channel = channel;
		this.volumeLevel = volumeLevel;
	}

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public void setChannel(int newChannel) {
		if (on && newChannel >= 1 && newChannel <= 120) {
			channel = newChannel;
		}
	}

	public void setVolume(int newVolumeLevel) {
		if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
			volumeLevel = newVolumeLevel;
		}
	}

	public void channelUp() {
		if (on && channel < 120) {
			channel++;
		}
	}

	public void channelDown() {
		if (on && channel > 1) {
			channel--;
		}
	}

	public void volumeUp() {
		if (on && volumeLevel < 7) {
			volumeLevel++;
		}
	}

	public void volumeDown() {
		if (on && volumeLevel > 1) {
			volumeLevel--;
		}
	}
}
