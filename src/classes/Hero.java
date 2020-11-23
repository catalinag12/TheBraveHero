package classes;

import java.util.Random;

import interfaces.Actions;
import interfaces.HeroInterface;

public class Hero implements HeroInterface, Actions {
	public int life;
	public int power;
	public int defence;
	public int speed;
	public int luck;
	
	public Hero(int life, int power, int defence, int speed, int luck) {
		super();
		this.life = life;
		this.power = power;
		this.defence = defence;
		this.speed = speed;
		this.luck = luck;
		System.out.println("Carl starts with "+ life + " life points");
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
	public void doublePower() {
		Random random=new Random();
		float n=random.nextInt(100);
		if(n<10) {
		this.power=power*2;
		System.out.println("The force of the dragon was activated");
		System.out.println("The power was doubled");
		}
	}

	@Override
	public void protectFromAttack(int damage) {
		Random random=new Random();
		float n=random.nextInt(100);
		if(n<20) {
		damage=damage/2;
		System.out.println("The magic shield was activated");
		System.out.println("The damage was half reduced");
		}
	}

	@Override
	public void defend(int damage) {
		protectFromAttack(damage);
		Random random=new Random();
		float n=random.nextInt(100);
		if(n<luck) {
		damage=0;
		System.out.println("Lucky! No damage");
		}
		System.out.println("Damage from attacker is: " +damage+ " points.");
		if(damage<this.life) {
		this.life=this.life-damage;
		System.out.println("Carl has " +this.life+" life points left");
		}
		else 
			{this.life=0;
			System.out.println("Carl has no life left");
			System.out.println("Beast wons");
			}
			}
	

	@Override
	public void attack() {
		System.out.println("Hero attacks");
		doublePower();
	}
	

}
