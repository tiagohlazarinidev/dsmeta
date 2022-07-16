import {Header} from './components/Header';
import {NotificationButton} from './components/NotificationButton';
import {SalesCard} from './components/SalesCard';

function App() {
  return (
    <>
      <Header />
      <section id="sales">
        <div className="desmeta-container">
          <SalesCard />
        </div>
      </section>
    </>
  );
}

export default App;
