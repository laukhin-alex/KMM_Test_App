import SwiftUI
import shared

struct ContentView: View {
    @ObservedObject var newsViewModal = NewsViewModal()
	let greet = Greeting().greeting()

	var body: some View {
        Text(greet).onAppear {
            newsViewModal.loadData()
        }
	}
}



struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
