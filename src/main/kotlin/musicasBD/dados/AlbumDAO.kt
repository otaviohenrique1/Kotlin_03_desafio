package musicasBD.dados

import musicasBD.extensions.toEntity
import musicasBD.extensions.toModel
import musicasBD.modelos.Album
import jakarta.persistence.EntityManager

class AlbumDAO(manager: EntityManager): DAO<Album, AlbumEntity>(manager, AlbumEntity::class.java) {
    override fun toModel(entity: AlbumEntity): Album {
        return entity.toModel()
    }

    override fun toEntity(model: Album): AlbumEntity {
        return model.toEntity()
    }
}