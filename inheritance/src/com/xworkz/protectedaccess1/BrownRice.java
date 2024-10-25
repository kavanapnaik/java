package com.xworkz.protectedaccess1;

import com.xworkz.protectedaccess.Rice;

public class BrownRice extends Rice
{

        public BrownRice(String variety)
        {
            super(variety);
        }

        public void displayVariety()
        {
            System.out.println("Rice Variety: " + variety);
        }

        public static void main(String[] args)
        {
            BrownRice brownRice = new BrownRice("Brown Rice");
            brownRice.displayVariety();
        }
    }

