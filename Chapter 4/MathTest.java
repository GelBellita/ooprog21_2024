class MathTest{
    public static void main(String[] args){
        double numberValue = 80.0;
        
        double sqrt = Math.sqrt(80);
        System.out.println("SQRT: "+sqrt);
        
        double sin = Math.sin(numberValue);
        System.out.println("SIN: "+sin);
        
        double cos = Math.cos(numberValue);
        System.out.println("COS: "+cos);
        
        double floor = Math.floor(numberValue);
        System.out.println("FLOOR: "+floor);
        
        double ceil = Math.ceil(numberValue);
        System.out.println("CEIL: "+ceil);
        
        long round = Math.round(numberValue);
        System.out.println("ROUND: "+round);
        
        int max = Math.max(28,90);
        System.out.println("MAX: " +max);
        
        int min = Math.min(28,90);
        System.out.println("MIN: " +min);
        
        double random = Math.random() * 10;
        System.out.println("RANDOM: "+ random);
    }
}