val dogBreeds = List("Doberman", "Yorkshire Terrier", "Dachshund", "Scottish Terrier",
  "Great Dane", "Portuguese Water Dog")
for {
  breed <- dogBreeds
  upcasedBreed = breed.toUpperCase()
} println(upcasedBreed)