import utils.DomainConstraint;
import utils.AttrRef;
import utils.DOpt;
import utils.OptType;


/**
 * @overview Person who have a phone
 * @attributes 
 *  id     integer  int     
 *  name   string   
 *  phone  MobilePhone
 * @object A typical person is p<i,n,ph> where id(i) name(n) phone(ph)
 * @abstract_properties
 *  mutable(id) = false /\  optional(id) = false /\ min(id) = 1
 *  mutable(name) = true /\ optional(name) = false /\ length(name) = 30 
 *  mutable(phone) = true /\ optional(phone) = true 
 */

public class Person{
    @DomainConstraint(type ="Integer", mutable = false, optional = false, min =1 )
    private int id;
    
    @DomainConstraint(type ="String", mutable = true, optional = false, length = 30)
    private String name;

    @DomainConstraint(type ="MobilePhone", mutable = true, optional = true)
    private MobilePhone phone;
/**
 * @effects <pre>
 *      if name is valid 
 *          then set this.name to name
 *          return true
 *      else
 *          return false
 * <pre>
 */
    @DOpt(type =OptType.Mutator) @AttrRef("name")
    public Boolean setName(String name){
        if(name.length() <= 30){
            this.name = name;
            return true;
        }
        else{
            return false;
        }
    }

/**
 * @effect  <pre>
 *      return greeting sentence to the customer
 * 
 * 
 */
    @DOpt(type =OptType.Observer) @AttrRef("name")
    public String greeting(){
        return "thank you "+this.name+ " for choosing us";
    }



    
    public static void main(String[] args){

        Person person1 = new Person();
        person1.setName("hung");
        System.out.print(person1.greeting());
}  
}

