import java.util.Scanner;

public class NovoCodigo_14_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		System.out.print("Entre com o primeiro inteiro:");
		n1 = sc.nextInt();
		System.out.print("Entre com o segundo inteiro:");
		n2 = sc.nextInt();
		System.out.print("Entre com o terceiro inteiro:");
		n3 = sc.nextInt();
		if(n1 > n2){
			if (n1 > n3){
				if ( n2< n3){
					System.out.println("O menor nuumero eh: " + n2);
				}else{
					System.out.println("O menor nuemero eh: " + n3);
				}
				System.out.println("O maior numero eh: " + n1);
			} else{
				if(n1<n2){
					System.out.println("O menor numero eh: " + n1);
				} else{
					System.out.println("O menor numero eh: " + n2);
				}
			}
		}
		

	}

}
