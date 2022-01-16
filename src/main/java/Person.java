import java.util.HashMap;
import java.util.Map;

    public class Person {
        String firstName;
        String iin;

        public Person(String firstName, String iin) {
            this.firstName = firstName;
            this.iin = iin;
        }

        public boolean equals(Object o){
            if(o instanceof Person){
                Person anotherPerson = (Person)o;

                if (firstName.equals(anotherPerson.firstName)) {
                    if (iin.equals(anotherPerson.iin)){
                        return true;
                    }else {
                        return false;
                    }
                }else {
                    return false;
                }
            } else {
                return false;
            }
        }

        public int hashCode(){
          return   firstName.hashCode() + iin.hashCode();
        }

        public static void main(String[] args) {
         Person sultan = new Person("Sultan","93299323929");
         Person sultan2 = new Person("Sulta1","93299323932");

         Person vova = new Person("Vova","883284828482");

         Map<Person, String> personMap = new HashMap<Person, String>();

         personMap.put(sultan,"A 105");
         personMap.put(vova,"A 102");
         personMap.put(sultan2, "B 200");

            System.out.println(personMap.get(sultan));
            System.out.println(personMap.get(sultan2));
        }

    }

