/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version 7.0
 */import java.util.ArrayList;
public class Club
{
    private  ArrayList <Membership> members;// question 1 ...
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        members=new ArrayList <Membership>();// question 1
        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        this.members.add(member); //question 3
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();  //question 2
    }
    public int joinedInMonth(int month){//question 4
            if(month<=0 || month>12){
                System.out.println("Invalid month"+ month);
                return 0;
            }else{
                int count = 0;
                for(Membership m : members){
                    if (m.getMonth()==month){
                        count++;
                    }
                }
                return count;
            }
    

    }
    /**
 * Remove from the club's collection all members who
 * joined in the given month, and return them stored
 * in a separate collection object.
   * @param month The month of the membership.
  * @param year The year of the membership.
  * @return The members who joined in the given month and year.
  */
public ArrayList<Membership> purge(int month, int year) { // question 5
    if (month <= 0 || month > 12) {
        System.out.println("Invalid month" + month);
        return null;
    }
    else if (year <= 1990 || year > 2026) {
        System.out.println("Invalid year " + year);
        return null;
    }
    else {
        ArrayList<Membership> removals = new ArrayList<Membership>();
        java.util.Iterator<Membership> it = members.iterator();
        
        while (it.hasNext()) {
            Membership m = it.next();
            
            if (m.getMonth() == month && m.getYear() == year) {
                removals.add(m);
                it.remove();
            }
        }
        
        if (removals.isEmpty()) {
            System.out.println("Membership not found " + month + "/" + year);
        }
        
        return removals;
    }
    }
}



 
