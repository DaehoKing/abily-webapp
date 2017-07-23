package web.data;

/**
 * Created by User on 2017-07-16.
 */
public class Spittle {
    String id;

    public Spittle(String str){
        this.id = str;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        assert o != null;
        if(o instanceof Spittle == false) return false;
        if( this == o ) return true;
        if( ((Spittle)o).getId() == this.id) return true;
        return false;
    }

    @Override
    public int hashCode(){
        return id.hashCode();
    }
}
