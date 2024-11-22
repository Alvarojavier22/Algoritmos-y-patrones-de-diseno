package org.utec.modulo2.ej9;

public class ParticionSubConjunto {

    public static boolean puedeParticionarse(int [] nums){

        int sumaTotal = 0;
        for( int n : nums){
            sumaTotal += n;
        }
        if(sumaTotal % 2 != 0){
            return false;
        }
        int objetivo = sumaTotal / 2;
        return puedeParticionarRecursivo(nums, objetivo, 0);
    }
    public static boolean puedeParticionarRecursivo(int [] nums, int objetivo, int indice){
        if(objetivo == 0){
            return true;
        }
        if (indice >= nums.length || objetivo < 0){
            return false;
        }
        boolean incluirNumero = puedeParticionarRecursivo(nums, objetivo - nums[indice], indice + 1);
        if(incluirNumero){
            return true;
        }
        return puedeParticionarRecursivo(nums, objetivo, indice + 1);
    }
}
