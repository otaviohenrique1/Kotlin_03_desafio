package musicasBD.extensions

import musicasBD.dados.AlbumEntity
import musicasBD.modelos.Album

fun Album.toEntity(): AlbumEntity {
    return AlbumEntity(this.titulo, this.banda.toEntity(),this.id)
}

fun AlbumEntity.toModel(): Album {
    return Album(this.titulo, this.banda.toModel(), this.id)
}