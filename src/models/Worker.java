/*
* File: Worker.java
* Author: Juhász Roland
* Copyright: 2021, Juhász Roland
* Group: Szoft I N
* Date: 2021-05-31
* Github: https://github.com/Roleeygit/beosztas
* Licenc: GNU GPL
*/

package models;

public class Worker {
    public int id;
    public String name;
    public int groupId;
    public Worker(int id, String name, int groupId) {
        this.id = id;
        this.name = name;
        this.groupId = groupId;
    }
    
}