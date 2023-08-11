import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DoctorfrontendComponent } from './doctorfrontend.component';

describe('DoctorfrontendComponent', () => {
  let component: DoctorfrontendComponent;
  let fixture: ComponentFixture<DoctorfrontendComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DoctorfrontendComponent]
    });
    fixture = TestBed.createComponent(DoctorfrontendComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
