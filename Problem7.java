// Define an interface named Filterable with abstract methods
// like apply_filter(filter_type) and reset_filter().
// Create two classes, ImageProcessor and DataAnalyzer, that
// both implement the Filterable interface.
// Implement the methods in each class to perform distinct actions relevant to image
// and data processing respectively, showcasing a shared contract with different
// implementations.
from abc import ABC, abstractmethod

# Interface / Abstract class
class Filterable(ABC):
    @abstractmethod
    def apply_filter(self, filter_type):
        pass

    @abstractmethod
    def reset_filter(self):
        pass

# Class for Image Processing
class ImageProcessor(Filterable):
    def __init__(self, image_name):
        self.image_name = image_name
        self.current_filter = None

    def apply_filter(self, filter_type):
        self.current_filter = filter_type
        print(f"Applied '{filter_type}' filter to image '{self.image_name}'.")

    def reset_filter(self):
        self.current_filter = None
        print(f"Filters reset for image '{self.image_name}'.")

# Class for Data Analysis
class DataAnalyzer(Filterable):
    def __init__(self, dataset_name):
        self.dataset_name = dataset_name
        self.current_filter = None

    def apply_filter(self, filter_type):
        self.current_filter = filter_type
        print(f"Applied '{filter_type}' filter on dataset '{self.dataset_name}'.")

    def reset_filter(self):
        self.current_filter = None
        print(f"Filters reset for dataset '{self.dataset_name}'.")


# Testing the classes
img_proc = ImageProcessor("Landscape.jpg")
data_analyzer = DataAnalyzer("Sales_Data.csv")

# Using ImageProcessor
img_proc.apply_filter("Grayscale")
img_proc.reset_filter()

# Using DataAnalyzer
data_analyzer.apply_filter("Top 10 Rows")
data_analyzer.reset_filter()
