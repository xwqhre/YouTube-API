package com.example.myyoutubechik.repositoriesimport androidx.lifecycle.LiveDataimport androidx.lifecycle.liveDataimport com.example.myyoutubechik.core.network.result.Resourceimport com.example.myyoutubechik.data.remote.RemoteDataSourceimport com.example.myyoutubechik.data.remote.model.PlaylistItemimport com.example.myyoutubechik.data.remote.model.Videosimport kotlinx.coroutines.Dispatchersclass Repository(private val dataSource: RemoteDataSource) {    fun getPlaylists(): LiveData<Resource<PlaylistItem>> {        return liveData(Dispatchers.IO) {            emit(Resource.loading())            val response = dataSource.getPlaylists()            emit(response)        }    }    fun getPlaylistItem(playlistId: String): LiveData<Resource<PlaylistItem>> {        return liveData(Dispatchers.IO) {            emit(Resource.loading())            val response = dataSource.getPlaylistItem(playlistId)            emit(response)        }    }    fun getVideo(id: String): LiveData<Resource<Videos>> {        return liveData(Dispatchers.IO) {            emit(Resource.loading())            val response = dataSource.getVideo(id)            emit(response)        }    }}