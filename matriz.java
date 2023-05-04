package act15;



public class matriz {

	
	public int multiMatriz () {
		

		int co1= 2 ;
		int fi1= 2;
		int co2= 2;
		int fi2= 2 ;
		
		
		
		int [][] matriz1 = {{1,5},{2,3}};
		int [][] matriz2 = {{7,8},{5,1}};
		
		//1 5      7 8
		//2 3      5 1 
		
		if (co1 == fi2) {
			
		int C11 = ((matriz1 [0][0] * matriz2 [0][0])+(matriz1 [0][1] * matriz2 [1][0]))  ;
		int C12 = ((matriz1 [0][0] * matriz2 [0][1])+(matriz1 [0][1] * matriz2 [1][1]))  ;  	
		int C21 = ((matriz1 [1][0] * matriz2 [0][0])+(matriz1 [1][1] * matriz2 [1][0]))  ; 	
		int C22 = ((matriz1 [1][0] * matriz2 [0][1])+(matriz1 [1][1] * matriz2 [1][1]))  ; 	
			
			
			int [][] matrizR = {{C11,C12},{C21,C22}};
			
			for(int i = 0; i < matrizR.length; i++){ 
				for(int j = 0; j < matrizR[i].length; j++){ 
					System.out.print(matrizR[i][j] + " ");	
				} 
				System.out.println();	 
			}
			
			
			
		} else {
			
			System.out.println("Estas matrices no se pueden multiplicar");
			System.out.println("Intenta con otras");	
			
		}
	 	
	return 0;	
	}
	
	
	public int transponerMatriz() {
		
	
		
		int [][] matriz = {{1,5,9},{2,3,8},{7,3,7}};
		
		// 1 5 9
		// 2 3 8
		// 7 3 7
		
		for (int x=0;x< matriz.length;x++) {
			
			for (int y=0;y< matriz [x].length;y++) {
				
				System.out.print(matriz[y][x] + " ");	 	
			}
			System.out.println();	
		}
	
		return 0;
	}
	
	public int sumaDiagonal() {
		
		int [][] matrizD = {{5,8,9},{7,6,4},{7,4,8}};
		
		// 5 8 9
		// 7 6 4
		// 7 4 8	
					int w = matrizD.length;
					
					for (int z=0; z<w ;z++ ) {
					
						int c = matrizD [z][z];
						
						int[] sum = {c} ;
						
						int wi = sum.length;
						
						
						for (int zi=0; zi<wi ;zi++ ) {
						
							System.out.println(sum [zi]);	
						
							
					}
						
					}
							 
			   
				 		
				
			//System.out.println();
			

		
	
		return 0;
	
	}
	
	
	public int maximoMatriz() {
		
		
		
		int [][] matrizM = {{2,7,8},{1,2,78},{2,7,99}};
		
						int mM = matrizM.length;
						
						for(int X = 0; X < matrizM.length; X++){ 
							for(int Y = 0; Y < matrizM[X].length; Y++){
								
								
								int a= matrizM[X][Y];
								
								int[] max = {a} ;
								
								int mmm = max.length;
								
								
								for (int zi=0; zi<mmm ;zi++ ) {
								
									int maximo = max [zi];
									
									if (max [zi]> maximo) {
			
										
									}
									
									System.out.println(maximo);
								
									
							}
								
								
							} 
							 
						}
		
	return 0;	
	}
	
	public int sumaMatriz() {
		
		
		int [][] matriz1s = {{1,5},{2,3}};
		int [][] matriz2s = {{7,8},{5,1}};
	
		
		
		 for (int x1 = 0; x1 < matriz1s.length; x1++) {
	            for (int y1 = 0; y1 < matriz1s[x1].length; y1++) {
	            	
	            	int a1= matriz1s[x1][y1];
	            	
	            	
	            	 for (int x2 = 0; x2< matriz2s.length; x2++) {
	     	            for (int y2 = 0; y2 < matriz2s[x2].length; y2++) {
	     	            	
	     	            	int a2= matriz2s[x2][y2];
	     	            	
	     	            	
	     	            	int	matrizSuma = matriz2s[x2][y2] + matriz1s[x1][y1];
	     	            	
	     	            	for (int xr = 0; xr< matriz2s.length; xr++) {
	     	   	            for (int yr = 0; yr < matriz2s[xr].length; yr++) {
	     	   	            	
	     	   	            System.out.println(matrizSuma);
	     	   	            	
	     	   	         
	     	   	            	
	     	   	      		
	     	   	            }
	     	   	        }
	     	            	
	     	            	
	     	            	
	     	      		
	     	            }
	     	        }
	      		
	            }
	        }
		
		 
		 
	      
		
		
		
		
		
		return 0;
	}
	
	public int matrizEscalar() {
		
	
		
		int [][] matriz = {{8,7,4},{5,3,18},{57,3,77}};
		int escalar=3;
		
		
		
		for (int x=0;x< matriz.length;x++) {
			
			for (int y=0;y< matriz [x].length;y++) {
				
				System.out.print((matriz[x][y]* escalar) + " ");	 	
			}
			System.out.println();	
		}
	
		return 0;
	}
	
	
	
	
	}
