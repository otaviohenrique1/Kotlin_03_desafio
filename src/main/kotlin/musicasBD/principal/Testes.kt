package musicasBD.principal

import musicasBD.dados.AlbumDAO
import musicasBD.dados.Banco
import musicasBD.dados.BandaDAO
import musicasBD.modelos.Album
//import musicasBD.modelos.Banda

fun main(){
    val manager = Banco.getEntityManager()

//    val titas = Banda("Titãs")
    val albumDAO = AlbumDAO(manager)
    val bandaDAO = BandaDAO(manager)

    val titas = bandaDAO.recuperarPeloId(1)

    val goBack = Album("Go Back", titas)
    val cabecaDinossauro = Album("Cabeça Dinossauro", titas)

//    bandaDAO.adicionar(titas)
    albumDAO.adicionar(cabecaDinossauro)
    albumDAO.adicionar(goBack)

    val listaBandas = bandaDAO.getLista()
    println(listaBandas)
    val listaAlbuns = albumDAO.getLista()
    println(listaAlbuns)

    manager.close()

//    println(titas)
//    println(goBack)
//    println(cabecaDinossauro)
}