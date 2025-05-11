package GusserGame;

import java.util.Scanner;

class Gusser{
    int Guessnumber;
    public int takeGussernumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Gusser guess a number");
        Guessnumber = sc.nextInt();
        return Guessnumber;
    }

}
class Player{
    int Playernumber;
    public int takePlayernumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Player guess a number");
        Playernumber = sc.nextInt();
        return Playernumber;

}
}
class Umpire{
    int nofromGusser;
    int nofromPlayer1;
    int nofromPlayer2;
    int nofromPlayer3;
    
    void collectfromGusser(){
        Gusser g = new Gusser();
          nofromGusser = g.takeGussernumber();
     }

     void collectfromplayer(){
        Player p1 = new Player();
        nofromPlayer1 = p1.takePlayernumber();

        Player p2 = new Player();
        nofromPlayer2 = p2.takePlayernumber();
        
        Player p3 = new Player();
        nofromPlayer3 = p3.takePlayernumber();

     }
     void compare(){
        if(nofromPlayer1==nofromGusser){
            if(nofromPlayer2==nofromGusser && nofromPlayer3==nofromGusser){
                System.out.println("All Player Won The Game");
            }
            else if(nofromPlayer2==nofromGusser){
                System.out.println("Only Player1 & Player2 Won the Game");
            }
            else if(nofromPlayer3==nofromGusser){
                System.out.println("Player1 & Player3 Won The Game");
            }
            else{
                System.out.println("only player1 won the game");
            }
        }
        else if(nofromPlayer2==nofromGusser){
            if(nofromPlayer3==nofromGusser){
                System.out.println("Only Player2 & Player3 Won the Game");
            }
            else{
                System.out.println("Only Player2 Won the Game");
            }
        }
        else if(nofromPlayer3==nofromGusser){
            System.out.println("Only Player3 Won the game");
        }
        else{
            System.out.println("No Player Won the Game");
        }
     }

}
public class m {
    public static void main(String[] args) {
        Umpire U =new Umpire();
        U.collectfromGusser();
        U.collectfromplayer();
        U.compare();
    }
    
}
