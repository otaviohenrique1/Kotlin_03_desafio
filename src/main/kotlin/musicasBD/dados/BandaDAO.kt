package musicasBD.dados

import musicasBD.extensions.toEntity
import musicasBD.extensions.toModel
import musicasBD.modelos.Banda
import jakarta.persistence.EntityManager

class BandaDAO(manager: EntityManager): DAO<Banda, BandaEntity>(manager, BandaEntity::class.java) {
    override fun toModel(entity: BandaEntity): Banda {
        return entity.toModel()
    }

    override fun toEntity(model: Banda): BandaEntity {
        return model.toEntity()
    }
}