import utils.DomainConstraint;

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

}
