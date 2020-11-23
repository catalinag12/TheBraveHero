package classes;

import java.util.Random;

import interfaces.Actions;

public class Beast implements Actions{
	public int life;
	public int power;
	public int defence;
	public int speed;
	public int luck;
	
	public Beast(int life, int power, int defence, int speed, int luck) {
		super();
		this.life = life;
		this.power = power;
		this.defence = defence;
		this.speed = speed;
		this.luck = luck;
		System.out.println("Beast starts with "+ life + " life points");

	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getDefence() {
		return defence;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getLuck() {
		return luck;
	}
	public void setLuck(int luck) {
		this.luck = luck;
	}
	@Override
	public void attack() {
		System.out.println("Beast attacks");
	}
	@Override
	public void defend(int damage) {
		Random random=new Random();
		float n=random.nextInt(100);
		if(n<luck) {
		damage=0;
		System.out.println("Lucky! No damage");
		}
		System.out.println("Damage from attacker is: " +damage+ " points.");
		if(damage<this.life) {
		this.life=this.life-damage;
		System.out.println("Beast has " + this.life+" life points left");
		}
		else { this.life=0;
		System.out.println("Beast has no life left");
		System.out.println("Carl wons!");
		}
		}
}
