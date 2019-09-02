export class Movie {
    movieId:number
    movieTitle:string
    movieRating:number
    releaseDate:any
    movieLang:string
    movieDuration:number
    movieCategory:string
    movieDesc:string
    movieActors:string
    movieDirector:string
    movieProducer:string
    moviePoster:string

    constructor() {
        this.movieId=0,
        this.movieTitle='',
        this.movieRating=0,
        this.releaseDate=''
        this.movieLang=''
        this.movieDuration=0
        this.movieCategory=''
        this.movieDesc=''
        this.movieActors=''
        this.movieDirector=''
        this.movieProducer=''
        this.moviePoster=''
    }
}
