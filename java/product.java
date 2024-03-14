public class product {
     
         String pcode;
         double price;
         String pname;
    
        public product(String pcode, String pname, double price) 
        {
            this.pcode = pcode;
            this.pname = pname;
            this.price = price;
        }
        
        public static void main(String[] args) {
            product p1 = new product( "p1", "pen", 10);
            product p2 = new product("p2", "book", 55);
            product p3 = new product("p3", "calculator", 1000);

            if(p1.price<=p2.price && p1.price<=p3.price )
            {
                System.out.println("Product with lowest price: " + p1.pname + " - $" + p1.price);
            }
            else if(p2.price<p1.price && p2.price<p3.price)
            {
                System.out.println("Product with lowest price: " + p2.pname + " - $" + p2.price);
            }
            else
            {
                System.out.println("Product with lowest price: " + p3.pname + " - $" + p3.price);
            }
            }
            
        }

        

