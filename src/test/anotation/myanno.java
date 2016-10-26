
package test.anotation;


public @interface myanno {
     String name="ahmed";
     String name ();
     String age();
     String tall ()default "168" ;
    // String [] friendsname();
    
} @myanno(
       name="ahmed",
        age="33",
         tall=="45",
      )
