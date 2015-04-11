package DuckCompare;

public class Duck implements Comparable<Duck> {
    final String name;
    final int    weight;

    public Duck( final String name, int weight ) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Duck otherDuck ) {
        int result = 0;
        
        if( otherDuck.weight - this.weight != 0 ){
            result = ( otherDuck.weight > this.weight ) ? -1 : 1;
        }
        
        return result;
    }
    
    @Override
    public String toString() {
        StringBuffer holdStr = new StringBuffer();
        holdStr.append("Duck's [ name : ");
        holdStr.append( this.name );
        holdStr.append( " ; weight : " );
        holdStr.append( this.weight );
        holdStr.append(  " ]" );
        return holdStr.toString();
    }

}
