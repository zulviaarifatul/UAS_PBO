from medium_product import MediumProduct
from large_product import LargeProduct
from small_product import SmallProduct


small = SmallProduct(10000, "Popcorn")
print(small.calculate_delivery())

medium = MediumProduct(15000, "Popcorn")
print(medium.calculate_delivery())

large = LargeProduct(20000, "Popcorn")
print(large.calculate_delivery())






