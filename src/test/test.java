package test;

import java.util.Random;

import classes.Beast;
import classes.Hero;

public class test {
	
	public static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Upper bound should be greater than the lower bound!");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

	public static void main(String[] args) {

		Hero Carl=new Hero(getRandomNumberInRange(65, 95),
				getRandomNumberInRange(60,70),
				getRandomNumberInRange(40, 50),
				getRandomNumberInRange(40, 50),
				getRandomNumberInRange(10, 30));
		
		Beast beast=new Beast(getRandomNumberInRange(55,80),
				getRandomNumberInRange(50,80),
				getRandomNumberInRange(35, 55),
				getRandomNumberInRange(40, 60),
				getRandomNumberInRange(25, 40));
		
	int rounds=1;
	boolean flag=false;
	if(Carl.getSpeed()>beast.getSpeed())
		flag=true;
	else if(Carl.getSpeed()==beast.getSpeed()) {
		if(Carl.getLuck()>beast.getLuck())
			flag=true;
	}
	
	while(rounds<=20 && Carl.getLife()>0 && beast.getLife()>0) {
		System.out.println("Round " + rounds);
		
		if(flag) {
			Carl.attack();
			int damage=Carl.getPower()-beast.getDefence();
			if(damage<0) damage=0;
			else if(damage>100) damage=100;
			beast.defend(damage);
			rounds++;
			flag=false;
		}
		else {
			beast.attack();
			int damage=beast.getPower()-Carl.getDefence();
			if(damage<0) damage=0;
			else if(damage>100) damage=100;
			Carl.defend(damage);
			rounds++;
			flag=true;
		}
		if(rounds==20) {
			System.out.println("Game over!");
			
		}

	}
	
	}

}
