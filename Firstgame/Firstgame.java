import java.util.Scanner;
public class Firstgame {
public static void main(String[] args) {
	System.out.println("this is a easy game\n");
	Scanner in = new Scanner(System.in);
	int n,max,index=0,c,cc,ans,hard,ch;
	boolean b=false,kerker=false;
do{
	System.out.println("please select the level of this game easy mid hard 0 1 2:");while(!in.hasNextInt());hard=in.nextInt();
	kerker=false;index=0;
	System.out.println("rule:you and computer count numbers,every one atmost can count 'max' number,and who counts n is the loser,please enter n and max:\n");
	System.out.println("please enter n:");while(!in.hasNextInt());n=in.nextInt();
	System.out.println("please enter max:");while(!in.hasNextInt());max=in.nextInt();
	while(index<n){
	   if(kerker==false){
	    	do{	
			System.out.println("please enter the number you count after "+index);
			while(!in.hasNextInt());c=in.nextInt();
	    	}while(c<=0||c>max);
		System.out.println("you count");
		for(int i=0;i<c;i++){
			System.out.println( (index+1) + " . ");
			index++;
		}
		kerker=true;
	   }
	   else{
	   	if(hard==0){
	   		cc=(int)(Math.random()*10000)%max+1;
	   	}
	   	else if(hard==2){
	   		ans=index%(max+1)-(n-1)%(max+1);
	   		if(ans==0){
				cc=(int)(Math.random()*10000)%max+1;
			}
			else{
				if(ans<0)ans=ans+max+1;
				cc=max+1-ans;
			}
		}
		else{
			cc=(int)(Math.random()*10000)%max+1;
			if((n-index)<max*2+2){
				ans=index%(max+1)-(n-1)%(max+1);
	   			if(ans!=0){
					if(ans<0)ans=ans+max+1;
					cc=max+1-ans;
				}
			}
		}
		System.out.println("\nthe computer count "+ cc +" after " + index);
		System.out.println("\nthe computer count");
		for(int i=0;i<cc;i++){
			System.out.println( (index+1) + " . ");
			index++;
		}
		System.out.println("\nnow the number has been counted to"+index);
		kerker=false;
	   }
	}
	if(kerker==false)System.out.println("you win\n");
	else System.out.println("the computer win \n\n");
	System.out.println("continue? 1 0 ");while(!in.hasNextInt());ch=in.nextInt();
	if(ch==0)b=false;
	else b=true;
}while(b==true);
}

}