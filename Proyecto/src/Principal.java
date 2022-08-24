import java.io.*;

public class Principal {
	public static void main(String[]args) {
		Metodos_Externos ord=new Metodos_Externos();
		Metodos_Internos ord2=new Metodos_Internos();
		InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
	    int op;
	    boolean B = true;
	    try {
	    	do {
	    		//Menu Principal
	    		System.out.println("\n\t\t\tESTRUCTURA DE DATOS 2");
	    		System.out.println("\n1.- Metodos Externos");
	    		System.out.println("2.- Metodos Internos");
	    		System.out.println("0.- Salir");
	    		op=Integer.parseInt(br.readLine());
	    		switch(op) {
	    		case 1:
	    			int op2;
	    			do {
	    				//Menu Externos
	    			System.out.println("\n\t\t\tMETODOS EXTERNOS");
	    			System.out.println("\n1.- Mezcla Directa");
	    			System.out.println("2.- Intercalacion");
	    			System.out.println("3.- Mezcla Natural");
	    			System.out.println("0.- Salir");
	    			op2=Integer.parseInt(br.readLine());
	    			switch(op2) {
	    			case 1:
	    				int n,v;
	    				String r;
	    				System.out.println("\n\t\t\tSelecciono Mezcla Directa");
	    				System.out.println("Ingresa el tamaño del vector: ");
	    				n=Integer.parseInt(br.readLine());
	    				int []Vec=new int[n];
	    				for(int i=0;i<n;i++) {
	    					System.out.println("Ingresa el valor en posicion "+i);
	    					v=Integer.parseInt(br.readLine());
	    					Vec[i]=v;
	    				}
	    				System.out.println("Arreglo Original");
	    				ord.Imprimir(Vec);
	    				System.out.println("\nArreglo Ordenado");
	    				Vec=ord.MezclaDirecta(Vec);
	    				ord.Imprimir(Vec);
	    				System.out.println("\n¿Desea buscar un valor dentro del arreglo?");
	    				r=br.readLine();
	    				switch (r) {
	    				case "y":
	    					Busqueda(Vec);
	    					break;
	    				case "n":
	    					break;
	    				}
	    				break;
	    			case 2:
	    				int n0,v0,n01,v01;
	    				int vec[];
	    				System.out.println("\n\t\t\tSelecciono Ordenamiento por Intercalacion");
	    				System.out.println("Ingresa el tamaño del primer vector: ");
	    				n0=Integer.parseInt(br.readLine());
	    				int []Vec0=new int[n0];
	    				for(int i=0;i<n0;i++) {
	    					System.out.println("Ingresa el valor en posicion "+i);
	    					v0=Integer.parseInt(br.readLine());
	    					Vec0[i]=v0;
	    				}
	    				System.out.println("Ingresa el tamaño del Segundo vector: ");
	    				n01=Integer.parseInt(br.readLine());
	    				int []Vec01=new int[n01];
	    				for(int i=0;i<n01;i++) {
	    					System.out.println("Ingresa el valor en posicion "+i);
	    					v01=Integer.parseInt(br.readLine());
	    					Vec01[i]=v01;
	    				}
	    				System.out.println("Arreglo 1 Original");
	    				ord.Imprimir(Vec0);
	    				System.out.println("\nArreglo 2 Original");
	    				ord.Imprimir(Vec01);
	    				ord2.Burbuja(Vec0);
	    				ord2.Burbuja(Vec01);
	    				System.out.println("\nArreglo Ordenado");
	    				vec=ord.intercalacion(Vec0, Vec01);
	    				ord2.Imprimir(vec);
	    				System.out.println("\n¿Desea buscar un valor dentro del arreglo?");
	    				r=br.readLine();
	    				switch (r) {
	    				case "y":
	    					Busqueda(vec);
	    					break;
	    				case "n":
	    					break;
	    				}
	    				break;
	    			case 3:
	    				int n1,v1;
	    				System.out.println("\n\t\t\tSelecciono Mezcla Natural");
	    				System.out.println("Ingresa el tamaño del vector: ");
	    				n1=Integer.parseInt(br.readLine());
	    				int []Vec1=new int[n1];
	    				for(int i=0;i<n1;i++) {
	    					System.out.println("Ingresa el valor de la posicion "+i);
	    					v1=Integer.parseInt(br.readLine());
	    					Vec1[i]=v1;
	    				}
	    				System.out.println("Arreglo Original");
	    				ord.Imprimir(Vec1);
	    				System.out.println("\nArreglo Ordenado");
	    				Vec1=ord.MezclaDirecta(Vec1);
	    				ord.Imprimir(Vec1);
	    				System.out.println("\n¿Desea buscar un valor dentro del arreglo?");
	    				r=br.readLine();
	    				switch (r) {
	    				case "y":
	    					Busqueda(Vec1);
	    					break;
	    				case "n":
	    					break;
	    				}
	    				break;
	    			case 0:
	    				
	    				break;
	    			}
	    				
	    			}while(op2!=0);
	    			break;
	    		case 2:
	    			int op3;
	    			do {
	    				//Menu Internos
	    				System.out.println("\n\t\t\tMETODOS INTERNOS");
	    				System.out.println("\n1.- Burbuja");
	    				System.out.println("2.- QuickSort");
	    				System.out.println("3.- ShellSort");
	    				System.out.println("4.- Radix");
	    				System.out.println("0.- Salir");
	    				op3=Integer.parseInt(br.readLine());
	    				switch(op3) {
	    				case 1:
	    					int n,v;
	    					String r;
	    					System.out.println("\n\t\t\tSelecciono Burbuja");
		    				System.out.println("Ingresa el tamaño del vector: ");
		    				n=Integer.parseInt(br.readLine());
		    				int []Vec=new int[n];
		    				for(int i=0;i<n;i++) {
		    					System.out.println("Ingresa el valor de la posicion "+i);
		    					v=Integer.parseInt(br.readLine());
		    					Vec[i]=v;
		    				}
		    				System.out.println("Arreglo Original");
		    				ord2.Imprimir(Vec);
		    				System.out.println("\nArreglo Ordenado");
		    				ord2.Burbuja(Vec);
		    				ord2.Imprimir(Vec);
		    				System.out.println("\n¿Desea buscar un valor dentro del arreglo?");
		    				r=br.readLine();
		    				switch (r) {
		    				case "y":
		    					Busqueda(Vec);
		    					break;
		    				case "n":
		    					break;
		    				}
		    				break;
	    				case 2:
	    					int n0,v0;
	    					System.out.println("\n\t\t\tSelecciono QuickSort");
	    					System.out.println("Ingresa el tamaño del vector: ");
		    				n0=Integer.parseInt(br.readLine());
		    				int []Vec0=new int[n0];
		    				for(int i=0;i<n0;i++) {
		    					System.out.println("Ingresa el valor de la posicion "+i);
		    					v0=Integer.parseInt(br.readLine());
		    					Vec0[i]=v0;
		    				}
		    				System.out.println("Arreglo Original");
		    				ord2.Imprimir(Vec0);
		    				System.out.println("\nArreglo Ordenado");
		    				ord2.Quicksort(Vec0, 0, Vec0.length-1);
		    				ord2.Imprimir(Vec0);
		    				System.out.println("\n¿Desea buscar un valor dentro del arreglo?");
		    				r=br.readLine();
		    				switch (r) {
		    				case "y":
		    					Busqueda(Vec0);
		    					break;
		    				case "n":
		    					break;
		    				}
		    				break;
	    				case 3:
	    					int n1,v1;
	    					System.out.println("\n\t\t\tSelecciono ShellSort");
	    					System.out.println("Ingresa el tamaño del vector: ");
		    				n1=Integer.parseInt(br.readLine());
		    				int []Vec1=new int[n1];
		    				for(int i=0;i<n1;i++) {
		    					System.out.println("Ingresa el valor de la posicion "+i);
		    					v1=Integer.parseInt(br.readLine());
		    					Vec1[i]=v1;
		    				}
		    				System.out.println("Arreglo Original");
		    				ord2.Imprimir(Vec1);
		    				System.out.println("\nArreglo Ordenado");
		    				ord2.Shell(Vec1);
		    				ord2.Imprimir(Vec1);
		    				System.out.println("\n¿Desea buscar un valor dentro del arreglo?");
		    				r=br.readLine();
		    				switch (r) {
		    				case "y":
		    					Busqueda(Vec1);
		    					break;
		    				case "n":
		    					break;
		    				}
		    				break;
	    				case 4:
	    					int n2,v2;
	    					int vec[];
	    					System.out.println("\n\t\t\tSelecciono Radix");
	    					System.out.println("Ingresa el tamaño del vector: ");
		    				n2=Integer.parseInt(br.readLine());
		    				int []Vec2=new int[n2];
		    				for(int i=0;i<n2;i++) {
		    					System.out.println("Ingresa el valor de la posicion "+i);
		    					v2=Integer.parseInt(br.readLine());
		    					Vec2[i]=v2;
		    				}
		    				System.out.println("Arreglo Original");
		    				ord2.Imprimir(Vec2);
		    				System.out.println("\nArreglo Ordenado");
		    				vec=ord2.radix(Vec2);
		    				ord2.Imprimir(vec);
		    				System.out.println("\n¿Desea buscar un valor dentro del arreglo?");
		    				r=br.readLine();
		    				switch (r) {
		    				case "y":
		    					Busqueda(vec);
		    					break;
		    				case "n":
		    					break;
		    				}
		    				break;
	    				case 0:
	    					break;
	    				}
	    			}while(op3!=0);
	    			break;
	    	
	    			
	    		case 0:
	    			B=false;
	    			System.out.println("\t\t\tHASTA LA PROXIMA");
	    		}
	    		
	    	}while(B);
	    } catch(Exception e)
	    {
    e.printStackTrace();
}
	}
	
	//Metodos de busqueda
	public static void Busqueda(int []Vec) {
		Busqueda Bus=new Busqueda();
		InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
	    try {
	    System.out.println("\n\t\t\tMETODOS DE BUSQUEDA");
		System.out.println("1.- Busqueda Secuencial");
		System.out.println("2.- Busqueda Binaria");
		System.out.println("0.- Salir");
		int op4;
		op4=Integer.parseInt(br.readLine());
		switch(op4) {
		case 1:
			int V;
			System.out.println("\n\t\t\tSelecciono Busqueda Secuencial");
			System.out.println("Ingresa el valor a buscar: ");
			V=Integer.parseInt(br.readLine());
			int indi=Bus.Secuencial(Vec, V);
			Bus.Imprimir(Vec);
			if(indi!=-1) {
				System.out.println("\nElemento "+V+" Encontrado en el indice "+indi);
			}else {
				System.out.println("\nElemento "+V+" no fue encontrado");
			}
			break;
		case 2:
			int V1;
			System.out.println("\n\t\t\tSelecciono Busqueda Binaria");
			System.out.println("Ingresa el valor a buscar: ");
			V1=Integer.parseInt(br.readLine());
			int ind=Bus.Binaria(Vec, V1);
			Bus.Imprimir(Vec);
			if(ind!=-1) {
				System.out.println("\nEl elemento "+V1+" encontrado en el indice "+ind);
			}else {
				System.out.println("\nEl elemento "+V1+" no fue encontrado");
			}
		}
	    }catch(Exception e) { 
	    	e.printStackTrace();
	    }
	}
}