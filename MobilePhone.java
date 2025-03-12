import utils.DomainConstraint;

/**
 * @overview A mobilephone that a person can have
 * @attributes
 *      manName     String
 *      model       String
 *      color       Char
 *      year        Integer int 
 *      guaranted   Boolean 
 *   
 * 
 * @object A typical mobilephone is mp<m,mo,c,y,g> where manName(m) model(mo) color(c) year(y) guaranted(g)
 * @abstract_properties
 *       mutable(namName) = true /\ optional(namName) = false /\ length(manName)= 30
 *       mutable(model) = false /\ optional(model) = false /\ length(model) = 30 
 *       mutable(color) = false /\ optional(color) = false
 *       mutable(year) = false /\ optional(year) = false /\ min(year)=1973
 *       mutable(guaranted) = true /\ optional(guaranted) = false 
 */

public class MobilePhone{
    @DomainConstraint(type ="String",mutable = true, optional = false, length = 30)
    private String manName;

    @DomainConstraint(type = "String",mutable = false, optional = false, length = 30)
    private String model;

    @DomainConstraint(type= "Char",mutable = false, optional = false)
    private char color;

    @DomainConstraint(type ="Integer", mutable = false, optional = false, min = 1973)
    private int year;

    @DomainConstraint(type="Boolean", mutable = true, optional = false)
    private  Boolean guaranted;
}