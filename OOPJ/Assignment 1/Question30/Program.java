class Program {
    static double add(double num1,double num2){
        return (num1+num2);
    
    }
        public static void main(String[] args) {
            float num1=10;
            float num2=30;
            if(num1<num2)
            {
                System.out.println(num2+" is greater than "+num1);
            }
            else 
            System.out.println(num1+" is greater than "+num2);
    
            double result=add(num1,num2);
            System.out.println("addition is "+result);
            
        }
            
}