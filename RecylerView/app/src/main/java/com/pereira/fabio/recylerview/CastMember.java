package com.pereira.fabio.recylerview;

/**
 * Created by fabiopereira on 10/10/16.
 */

public class CastMember {

    ////////////////////////////////////////////////////////////
    // Member variables
    ////////////////////////////////////////////////////////////

    private String name;
    private String characterName;

    ////////////////////////////////////////////////////////////
    // Constructors
    ////////////////////////////////////////////////////////////

    public CastMember(){
        this.name = "";
        this.characterName = "";
    }

    public CastMember(String name, String characterName){
        this.name = name;
        this.characterName = characterName;
    }

    ///////////////////////////////////////////////////////////////////////////
    // Setters
    ///////////////////////////////////////////////////////////////////////////

    public void setName(String name) {
        this.name = name;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    ///////////////////////////////////////////////////////////////////////////
    // Getters
    ///////////////////////////////////////////////////////////////////////////

    public String getName() {
        return name;
    }

    public String getCharacterName() {
        return characterName;
    }

}
