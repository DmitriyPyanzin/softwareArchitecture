package hw5;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 3D модель
 */
class Model3D implements Entity {

    private static int counter = 10000;
    private final int id;
    private Collection<Texture> textures = new ArrayList<>();

    @Override
    public int getId() {return id;}

    {id = ++counter;}

    public Model3D(){}

    public Collection<Texture> getTextures() {return textures;}

    public Model3D(Collection<Texture> textures) {this.textures = textures;}

    @Override
    public String toString() {return String.format("3DModel #%s", id);}

}
