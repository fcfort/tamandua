package br.com.tamandua.persistence;

// Generated 21/02/2010 23:04:42 by Hibernate Tools 3.2.4.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EntityDescriptor generated by hbm2java
 */
@Entity
@Table(name = "entity_descriptor")
public class EntityDescriptor implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    
    public static final EntityDescriptor ENTITY_ALBUM              = new EntityDescriptor(1L, "Album", "album");
    public static final EntityDescriptor ENTITY_ARTIST             = new EntityDescriptor(2L, "Artist", "artist");
    public static final EntityDescriptor ENTITY_MUSIC              = new EntityDescriptor(3L, "Music", "music");
    public static final EntityDescriptor ENTITY_IMAGE              = new EntityDescriptor(4L, "Image", "image");
    public static final EntityDescriptor ENTITY_USER               = new EntityDescriptor(5L, "User", "user");
    public static final EntityDescriptor ENTITY_LYRIC              = new EntityDescriptor(6L, "Lyric", "lyric");
    public static final EntityDescriptor ENTITY_MULTIMEDIA         = new EntityDescriptor(7L, "Multimedia", "multimedia");
    public static final EntityDescriptor ENTITY_TAG                = new EntityDescriptor(8L, "Tag", "tag");
    public static final EntityDescriptor ENTITY_ANNOTATION         = new EntityDescriptor(9L, "Annotation", "annotation");
    public static final EntityDescriptor ENTITY_ARTIST_DISCOGRAPHY = new EntityDescriptor(10L, "ArtistDiscography", "artist_discography");
    public static final EntityDescriptor ENTITY_MODERATION         = new EntityDescriptor(11L, "Moderation", "moderation");
    public static final EntityDescriptor ENTITY_MUSIC_ARTIST       = new EntityDescriptor(12L, "MusicArtist", "music_artist");
    public static final EntityDescriptor ENTITY_DESCRIPTOR         = new EntityDescriptor(13L, "EntityDescriptor", "entity_descriptor");
    public static final EntityDescriptor ENTITY_ARTIST_ALIAS       = new EntityDescriptor(14L, "ArtistAlias", "artist_alias");

    private Long idEntityDescriptor;
    private String entityName;
    private String tableName;

    public EntityDescriptor() {
    }

    public EntityDescriptor(Long idEntityDescriptor) {
        this.idEntityDescriptor = idEntityDescriptor;
    }

    public EntityDescriptor(Long idEntityDescriptor, String entityName, String tableName) {
        this.idEntityDescriptor = idEntityDescriptor;
        this.entityName = entityName;
        this.tableName = tableName;
    }

    @Id
    @Column(name = "id_entity_descriptor", unique = true, nullable = false)
    public Long getIdEntityDescriptor() {
        return this.idEntityDescriptor;
    }

    public void setIdEntityDescriptor(long idEntityDescriptor) {
        this.idEntityDescriptor = idEntityDescriptor;
    }

    @Column(name = "entity_name", length = 50)
    public String getEntityName() {
        return this.entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    @Column(name = "table_name", length = 50)
    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((entityName == null) ? 0 : entityName.hashCode());
        result = prime * result + ((idEntityDescriptor == null) ? 0 : idEntityDescriptor.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EntityDescriptor other = (EntityDescriptor) obj;
        if (entityName == null) {
            if (other.entityName != null)
                return false;
        } else if (!entityName.equals(other.entityName))
            return false;
        if (idEntityDescriptor == null) {
            if (other.idEntityDescriptor != null)
                return false;
        } else if (!idEntityDescriptor.equals(other.idEntityDescriptor))
            return false;
        return true;
    }
}