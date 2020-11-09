# Group Project -  Album Collection

## Objective
Our friends at the local soda shop have gotten tired of taken phone calls about their jukebox.  After a feature in the newspaper about how cool their vintage jukebox was they have been swamped with requests from jukebox enthusiasts for an album list.

They have tasked us with creating an application that can easily keep track of their _EXTENSIVE_ record collection and access music by albums or individual tracks.  This collection is in a constant state of flux, so it is essential for the users to be able to update the collection and it's elements.

## API Creation 

First, we are going to need to create an API using Spring that will handle our DB and interactions with it.

### Requirements
- [ ] Create a RESTful API with Spring Boot.
  - [ ] Endpoints for the following:
    - [ ] All `CRUD` operations for `album`s
      - [ ] Create endpoint
      - [ ] Read endpoint
      - [ ] Update endpoint
      - [ ] Delete endpoint
    - [ ] All `CRUD` operations for `song`s
      - [ ] Create endpoint
      - [ ] Read endpoint
      - [ ] Update endpoint
      - [ ] Delete endpoint
  - [ ] A database service layer for retrieving and storing `album`s and `songs`s from the database and interacting with the controllers.
  - [ ] Error handling
    - [ ] Resource not found
  - [ ] Integration testing suite
    - [ ] SmokeTests
    - [ ] HttpRequestTest
    - [ ] Application & WebLayer Tests
    
#### Relationships

Our user should be able to:
- access `song`s from the `album` the song is on.


#### User Input Fields

Each entity should have fields the user can interact with:
- Change an `album` or `song` name.
- Should have ratings (rating system can be your own design)
- Should have comments with a way to add them
- Have a way to delete an `album` or `song`.

## Single Page Application Front-end 

Next we will crate our front-end. It should be an SPA that uses JS to build out components that our users can interact with. Use modular JS to create reusable components.  This application should allow you to create new albums and songs, edit details about each of the items after they have been created, and delete items.

### User Interaction

Our users should be able to add new instances of 'album's and 'song's as well as comments and ratings.

## Entities

### `album`

- title
- image
- songs
- record label
- comments
- ratings

### `song`

- title
- link (optional)
- duration
- comments
- ratings